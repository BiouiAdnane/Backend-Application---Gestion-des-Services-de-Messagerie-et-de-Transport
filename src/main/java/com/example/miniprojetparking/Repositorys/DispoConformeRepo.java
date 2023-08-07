package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Enums.EtatVT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface DispoConformeRepo extends JpaRepository<Conducteur,String > {
    @Query("SELECT c FROM Conducteur c " +
            "WHERE c.CIN NOT IN " +
            "(SELECT v.conducteur.CIN FROM Voyage v WHERE " +
            "(:dateDebut BETWEEN v.Date_Debut AND v.Date_Fin) OR " +
            "(:dateFin BETWEEN v.Date_Debut AND v.Date_Fin)) " +
            "AND c.CIN NOT IN " +
            "(SELECT r.conducteur.CIN FROM Repos r WHERE " +
            "(:dateDebut BETWEEN r.date_Debut AND r.date_Fin) OR " +
            "(:dateFin BETWEEN r.date_Debut AND r.date_Fin)) " +
            "AND c.CIN IN " +
            "(SELECT c2.CIN FROM Conducteur c2 JOIN c2.permis p WHERE :typePermis MEMBER OF p.typePermisList)"
    )
    List<Conducteur> findConducteursDisponiblesByTypePermis(
            @Param("dateDebut") LocalDate dateDebut,
            @Param("dateFin") LocalDate dateFin,
            @Param("typePermis") String typePermis
    );


    @Query("SELECT v FROM Voiture v " +
            "WHERE :dateDebut > v.assurance.date_Debut AND :dateFin <= v.assurance.date_Fin " +
            "AND :dateDebut >= v.visiteTechnique.date_debut AND :dateFin <= v.visiteTechnique.date_Fin  " +
            "AND :dateDebut >= v.vignette.date_Debut AND :dateFin <= v.vignette.date_Fin " +
            "AND :dateDebut >= v.carteGrise.date_Debut AND :dateFin <= v.carteGrise.date_Fin " +
            "AND v.typePermisVoiture = :typePermis AND v.visiteTechnique.etat_Voiture = :etatVT " +
            "AND v.code_Voiture NOT IN " +
            "(SELECT vo.voiture.code_Voiture FROM Voyage vo WHERE " +
            "(:dateDebut BETWEEN vo.Date_Debut AND vo.Date_Fin) OR " +
            "(:dateFin BETWEEN vo.Date_Debut AND vo.Date_Fin))"
    )
    List<Voiture> findVoituresDisponiblesAndConforme(
            @Param("dateDebut") LocalDate dateDebut,
            @Param("dateFin") LocalDate dateFin,
            @Param("typePermis") String typePermis,
            @Param("etatVT") EtatVT etatVT
    );

}
