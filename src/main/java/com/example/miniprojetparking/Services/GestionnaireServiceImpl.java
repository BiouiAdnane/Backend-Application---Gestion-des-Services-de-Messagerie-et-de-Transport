package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Gestionnaire;
import com.example.miniprojetparking.Repositorys.GestionnaireRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class GestionnaireServiceImpl implements GestionnaireService{
    private GestionnaireRepo gestionnaireRepo;
    @Override
    public Gestionnaire saveGestionnaire(Gestionnaire gestionnaire) {
        return gestionnaireRepo.save(gestionnaire);
    }

    @Override
    public List<Gestionnaire> getListGestionnaire() {
        return gestionnaireRepo.findAll();
    }

    public Optional<Gestionnaire> findGestionnaire(String id) {
        return gestionnaireRepo.findById(id);
    }

    @Override
    public void deleteGestionnaire(String id) {
        gestionnaireRepo.deleteById(id);

    }

    @Override
    public Gestionnaire updateGestionnaire(Gestionnaire gestionnaire) {
        return gestionnaireRepo.save(gestionnaire);
    }

    @Override
    public List<Gestionnaire> searchGestionnaire(String keyword) {
        return null;
    }

    @Override
    public int countGestionnaire() {
        return 0;
    }
}
