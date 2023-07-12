package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Assurance;
import com.example.miniprojetparking.Repositorys.AssuranceRepo;

import java.util.List;
import java.util.Optional;

public class AssuranceServiceImpl implements AssuranceService{
    private AssuranceRepo assuranceRepo;
    @Override
    public Assurance saveAssurance(Assurance assurance) {
        return assuranceRepo.save(assurance);
    }

    @Override
    public List<Assurance> getListAssurance() {
        return assuranceRepo.findAll();
    }

    @Override
    public Optional<Assurance> findAssurance(String Code_Assurance) {
        return assuranceRepo.findById(Code_Assurance);
    }

    @Override
    public void deleteAssurance(String Code_Assurance) {
        assuranceRepo.deleteById(Code_Assurance);

    }

    @Override
    public Assurance updateAssurance(Assurance assurance) {
        return assuranceRepo.save(assurance);
    }


}
