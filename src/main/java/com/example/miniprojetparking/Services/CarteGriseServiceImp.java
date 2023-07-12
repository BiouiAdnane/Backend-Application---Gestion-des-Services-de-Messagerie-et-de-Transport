package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Carte_Grise;
import com.example.miniprojetparking.Repositorys.Carte_GriseRepo;

import java.util.List;
import java.util.Optional;

public class CarteGriseServiceImp implements CarteGriseService{
    private Carte_GriseRepo carteGriseRepo;
    @Override
    public Carte_Grise saveCarte_Grise(Carte_Grise carteGrise) {
        return carteGriseRepo.save(carteGrise);
    }

    @Override
    public List<Carte_Grise> getListCarte_Grise() {
        return carteGriseRepo.findAll();
    }

    @Override
    public Optional<Carte_Grise> findCarte_Grise(String id) {
        return carteGriseRepo.findById(id);
    }

    @Override
    public void deleteCarte_Grise(String id) {
        carteGriseRepo.deleteById(id);
    }

    @Override
    public Carte_Grise updateCarte_Grise(Carte_Grise carteGrise) {
        return carteGriseRepo.save(carteGrise);
    }
}
