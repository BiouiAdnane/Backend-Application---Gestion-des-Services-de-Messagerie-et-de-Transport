package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Repositorys.VoitureRepo;

import java.util.List;
import java.util.Optional;

public class VoyageServiceImpl implements VoitureService{
    private VoitureRepo voitureRepo;
    @Override
    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepo.save(voiture);
    }

    @Override
    public List<Voiture> getListVoiture() {
        return voitureRepo.findAll();
    }

    @Override
    public Optional<Voiture> findVoiture(int id) {
        return voitureRepo.findById(id);
    }

    @Override
    public void deleteVoiture(int id) {
        voitureRepo.deleteById(id);
    }

    @Override
    public Voiture updateVoiture(Voiture voiture) {
        return voitureRepo.save(voiture);
    }
}
