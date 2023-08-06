package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VoyageRepo extends JpaRepository<Voyage,Integer > {
    @Query("select v from Voyage v where v.Ville_Arrive like :kw or v.Ville_Depart like :kw order by v.CodeVoyage asc ")
    List<Voyage> searchVoyage(@Param(value = "kw") String keyword);
}
