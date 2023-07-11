package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepo extends JpaRepository<Voiture,Integer > {
}
