package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Entities.Voyage;
import com.example.miniprojetparking.Repositorys.VoitureRepo;
import com.example.miniprojetparking.Repositorys.VoyageRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class VoyageServiceImpl implements VoyageService{
    private VoyageRepo voyageRepo;
    @Override
    public Voyage saveVoyage(Voyage voyage) {
        return voyageRepo.save(voyage);
    }

    @Override
    public List<Voyage> getListVoyage() {
        return voyageRepo.findAll();
    }

    @Override
    public Optional<Voyage> findVoyage(int id) {
        return voyageRepo.findById(id);
    }

    @Override
    public void deleteVoyage(int id) {
        voyageRepo.deleteById(id);
    }

    @Override
    public Voyage updateVoyage(Voyage voyage) {
        return voyageRepo.save(voyage);
    }
}
