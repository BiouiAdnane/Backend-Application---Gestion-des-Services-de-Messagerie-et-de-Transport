package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Entities.Voyage;
import com.example.miniprojetparking.Enums.TypePermis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ConformiteRepo extends JpaRepository<Conducteur,String > {
    //Liste des conducteurs qui sont conformes
    @Query("SELECT c FROM Conducteur c " +
            "JOIN c.permis p " +
            "WHERE p.TypePermisList = :typePermis")
    List<Conducteur> disponibleConducteurs(@Param("typePermis") TypePermis typePermis);





    //Liste des vehicules disponibles
    @Query("SELECT v FROM Voiture v " +
            "WHERE v.code_Voiture NOT IN " +
            "(SELECT vo.voiture.code_Voiture FROM Voyage vo WHERE " +
            "(:dateDebut BETWEEN vo.Date_Debut AND vo.Date_Fin) OR " +
            "(:dateFin BETWEEN vo.Date_Debut AND vo.Date_Fin)) "
    )
    List<Voiture> disponibleVehicules(@Param("dateDebut") LocalDate dateDebut,
                                      @Param("dateFin") LocalDate dateFin);
}
