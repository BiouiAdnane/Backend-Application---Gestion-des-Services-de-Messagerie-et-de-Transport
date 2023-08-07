package com.example.miniprojetparking.Services;


import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Enums.EtatVT;
import com.example.miniprojetparking.Repositorys.DispoConformeRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DispoConformeServiceImpl implements DispoConformeService{
    private DispoConformeRepo dispoConformeRepo;

    @Override
    public List<Conducteur> ListConducteurDispoConforme(LocalDate dateDebut, LocalDate dateFin, String typePermis) {
        return dispoConformeRepo.findConducteursDisponiblesByTypePermis(dateDebut, dateFin, typePermis);
    }

    @Override
    public List<Voiture> ListVehiculeDispoConforme(LocalDate dateDebut, LocalDate dateFin, String typePermis) {
        return dispoConformeRepo.findVoituresDisponiblesAndConforme(dateDebut, dateFin, typePermis, EtatVT.Conforme);
    }
}
