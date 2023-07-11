package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepo extends JpaRepository<Personne,String > {
}
