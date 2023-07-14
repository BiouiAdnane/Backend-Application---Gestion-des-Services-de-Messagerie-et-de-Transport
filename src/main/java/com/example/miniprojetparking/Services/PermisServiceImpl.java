package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Permis;
import com.example.miniprojetparking.Repositorys.PermisRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class PermisServiceImpl implements PermisService{
    private PermisRepo permisRepo;
    @Override
    public Permis savePermis(Permis permis) {
        return permisRepo.save(permis);
    }

    @Override
    public List<Permis> getListPermis() {
        return permisRepo.findAll();
    }

    @Override
    public Optional<Permis> findPermis(String id) {
        return permisRepo.findById(id);
    }

    @Override
    public void deletePermis(String id) {
        permisRepo.deleteById(id);
    }

    @Override
    public Permis updatePermis(Permis permis) {
        return permisRepo.save(permis);
    }
}
