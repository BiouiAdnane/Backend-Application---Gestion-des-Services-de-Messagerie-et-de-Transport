package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Gestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionnaireRepo extends JpaRepository<Gestionnaire,Integer > {
}
