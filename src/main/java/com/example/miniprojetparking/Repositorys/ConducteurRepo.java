package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConducteurRepo extends JpaRepository<Conducteur,String > {
    @Query("select c from Conducteur c where c.Nom like :kw or c.Prenom like :kw")
    List<Conducteur> searchConducteurs(@Param(value = "kw") String keyword);
}
