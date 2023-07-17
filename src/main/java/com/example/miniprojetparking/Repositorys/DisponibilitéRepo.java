package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface DisponibilitéRepo extends JpaRepository<Voyage,Integer > {

    //Liste des conducteurs disponibles
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

    //Liste des vehicules disponibles
    @Query("SELECT v FROM Voiture v WHERE v.")
}
