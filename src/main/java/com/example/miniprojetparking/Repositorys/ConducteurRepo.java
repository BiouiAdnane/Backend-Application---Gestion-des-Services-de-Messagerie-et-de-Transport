package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConducteurRepo extends JpaRepository<Conducteur,String > {
}
