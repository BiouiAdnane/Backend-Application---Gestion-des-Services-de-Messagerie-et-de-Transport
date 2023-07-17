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
    @Query("SELECT  c  FROM Conducteur c " +
            " Where  c.CIN NOT In " +
            "(SELECT  v.conducteur.CIN FROM Voyage v WHERE " +
            "((:dateDebut between v.Date_Debut and v.Date_Fin) OR (:dateFin between v.Date_Debut and v.Date_Fin)))"
    )
    List<Conducteur> disponibleCondicteurs(@Param("dateDebut") LocalDate dateDebut,
                                       @Param("dateFin") LocalDate dateFin);
}
