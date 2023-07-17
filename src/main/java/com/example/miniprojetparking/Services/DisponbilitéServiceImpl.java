package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Repositorys.DisponibilitéRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DisponbilitéServiceImpl implements DisponibilitéService{
    private DisponibilitéRepo disponibilitéRepo;

    @Override
    public List<Conducteur> ListConducteurDispo(LocalDate dateDebut, LocalDate dateFin) {
        return disponibilitéRepo.disponibleConducteurs(dateDebut, dateFin);
    }
}
