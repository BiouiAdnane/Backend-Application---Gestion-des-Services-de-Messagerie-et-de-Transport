package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoyageRepo extends JpaRepository<Voyage,Integer > {
}
