package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConformiteRepo extends JpaRepository<Conducteur,String > {

    //Liste des conducteurs qui sont conformes
    @Query("SELECT c FROM Conducteur c JOIN c.permis p WHERE :typePermis MEMBER OF p.typePermisList")
    List<Conducteur> findByTypePermis(@Param("typePermis") String typePermis);

    @Query("SELECT v FROM Voiture v WHERE v.typePermisVoiture = :typePermis")
    List<Voiture> findByTypePermisVehicule(@Param("typePermis") String typePermis);

}
