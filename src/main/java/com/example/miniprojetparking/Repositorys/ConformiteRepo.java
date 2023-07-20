package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Enums.EtatVT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ConformiteRepo extends JpaRepository<Conducteur,String > {

    //Liste des conducteurs qui sont conformes
    @Query("SELECT c FROM Conducteur c JOIN c.permis p WHERE :typePermis MEMBER OF p.typePermisList")
    List<Conducteur> findByTypePermis(@Param("typePermis") String typePermis);

    @Query("SELECT v FROM Voiture v WHERE v.typePermisVoiture = :typePermis AND v.visiteTechnique.etat_Voiture = :etatVT " +
            "AND (v.assurance.date_Debut < :dateDebut AND v.assurance.date_Fin > :dateFin) " +
            "AND (v.carteGrise.date_Debut < :dateDebut AND v.carteGrise.date_Fin > :dateFin) " +
            "AND (v.vignette.date_Debut < :dateDebut AND v.vignette.date_Fin > :dateFin) " +
            "AND (v.visiteTechnique.date_debut < :dateDebut AND v.visiteTechnique.date_Fin > :dateFin)")
    List<Voiture> findByTypePermisVehiculeConforme(@Param("typePermis") String typePermis, @Param("etatVT") EtatVT etatVT,
                                                   @Param("dateDebut") LocalDate dateDebut, @Param("dateFin") LocalDate dateFin);


    @Query("SELECT c FROM Conducteur c " +
            "WHERE c.CIN NOT IN " +
            "(SELECT v.conducteur.CIN FROM Voyage v WHERE " +
            "(:dateDebut BETWEEN v.Date_Debut AND v.Date_Fin) OR " +
            "(:dateFin BETWEEN v.Date_Debut AND v.Date_Fin)) " +
            "AND c.CIN NOT IN " +
            "(SELECT r.conducteur.CIN FROM Repos r WHERE " +
            "(:dateDebut BETWEEN r.date_Debut AND r.date_Fin) OR " +
            "(:dateFin BETWEEN r.date_Debut AND r.date_Fin))"
    )
    List<Conducteur> disponibleConducteurs(@Param("dateDebut") LocalDate dateDebut,
                                           @Param("dateFin") LocalDate dateFin);

}
