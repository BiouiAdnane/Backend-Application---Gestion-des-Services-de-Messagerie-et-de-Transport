package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Repositorys.ConducteurRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class ConducteurServiceImpl implements ConducteurService{
    private ConducteurRepo conducteurRepo;
    @Override
    public Conducteur saveConducteur(Conducteur conducteur) {
        return conducteurRepo.save(conducteur);
    }

    @Override
    public List<Conducteur> getListConducteur() {

        return conducteurRepo.findAll();
    }

    @Override
    public Optional<Conducteur> findConducteur(String id) {

        return conducteurRepo.findById(id);
    }

    @Override
    public void deleteConducteur(String id) {
        conducteurRepo.deleteById(id);

    }

    @Override
    public Conducteur updateConducteur(Conducteur conducteur) {

        return conducteurRepo.save(conducteur);
    }

    @Override
    public List<Conducteur> searchConducteur(String keyword) {
        return null;
    }

    @Override
    public int countConducteur() {
        return 0;
    }
}
