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





    @Query("SELECT v FROM Voiture v WHERE :dateDebut > v.assurance.date_Debut AND :dateFin <= v.assurance.date_Fin " +
            "AND :dateDebut >= v.visiteTechnique.date_debut AND :dateFin <= v.visiteTechnique.date_Fin  " +
            "AND :dateDebut >= v.vignette.date_Debut AND :dateFin <= v.vignette.date_Fin " +
            "AND :dateDebut >= v.carteGrise.date_Debut AND :dateFin <= v.carteGrise.date_Fin " +
            "AND v.typePermisVoiture = :typePermis AND v.visiteTechnique.etat_Voiture =:etatVT")
    List<Voiture> findVoitureByAssurance(@Param("dateDebut") LocalDate dateDebut ,@Param("dateFin") LocalDate dateFin,
                                         @Param("typePermis") String typePermis, @Param("etatVT") EtatVT etatVT);


}
