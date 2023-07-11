package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Vignette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VignetteRepo extends JpaRepository<Vignette,Integer > {
}
