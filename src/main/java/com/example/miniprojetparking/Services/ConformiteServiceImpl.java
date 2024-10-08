package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Enums.EtatVT;
import com.example.miniprojetparking.Repositorys.ConformiteRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ConformiteServiceImpl implements ConformiteService{
    private ConformiteRepo conformiteRepo;
    @Override
    public List<Conducteur> getListConducteurConforme(String typePermis) {
        return conformiteRepo.findByTypePermis(typePermis);
    }



    @Override
    public List<Voiture> getListeVoituresConforme(LocalDate dateDebut , LocalDate dateFin, String typePermis) {
        return conformiteRepo.findVoitureByAssurance(dateDebut , dateFin, typePermis, EtatVT.Conforme);
    }
}
