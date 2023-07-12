package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Visite_Technique;
import com.example.miniprojetparking.Repositorys.VisiteTechniqueRepo;

import java.util.List;
import java.util.Optional;

public class VisiteTechniqueServiceImpl implements VisiteTechniqueService{
    private VisiteTechniqueRepo visiteTechniqueRepo;
    @Override
    public Visite_Technique saveVisite_Technique(Visite_Technique visiteTechnique) {
        return visiteTechniqueRepo.save(visiteTechnique);
    }

    @Override
    public List<Visite_Technique> getListVisite_Technique() {
        return visiteTechniqueRepo.findAll();
    }

    @Override
    public Optional<Visite_Technique> findVisite_Technique(String id) {
        return visiteTechniqueRepo.findById(id);
    }

    @Override
    public void deleteVisite_Technique(String id) {
        visiteTechniqueRepo.deleteById(id);
    }

    @Override
    public Visite_Technique updateVisite_Technique(Visite_Technique visiteTechnique) {
        return visiteTechniqueRepo.save(visiteTechnique);
    }
}
