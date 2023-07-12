package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Vignette;
import com.example.miniprojetparking.Repositorys.VignetteRepo;

import java.util.List;
import java.util.Optional;

public class VignetteServiceImpl implements VignetteService{
    private VignetteRepo vignetteRepo;
    @Override
    public Vignette saveVignette(Vignette vignette) {
        return vignetteRepo.save(vignette);
    }

    @Override
    public List<Vignette> getListVignette() {
        return vignetteRepo.findAll();
    }

    @Override
    public Optional<Vignette> findVignette(int id) {
        return vignetteRepo.findById(id);
    }

    @Override
    public void deleteVignette(int id) {
        vignetteRepo.deleteById(id);
    }

    @Override
    public Vignette updateVignette(Vignette vignette) {
        return vignetteRepo.save(vignette);
    }
}
