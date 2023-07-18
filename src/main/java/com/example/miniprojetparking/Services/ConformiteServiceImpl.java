package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Enums.TypePermis;
import com.example.miniprojetparking.Repositorys.ConformiteRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ConformiteServiceImpl implements ConformiteService{
    private ConformiteRepo conformiteRepo;
    @Override
    public List<Conducteur> ListConducteurConforme(TypePermis typePermis) {
        return conformiteRepo.disponibleConducteurs(typePermis);
    }
}
