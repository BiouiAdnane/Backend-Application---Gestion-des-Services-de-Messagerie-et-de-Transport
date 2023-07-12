package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Permis;

import java.util.List;
import java.util.Optional;

public interface PermisService {
    Permis savePermis (Permis permis)  ;
    List<Permis> getListPermis();
    Optional<Permis> findPermis(String id)  ;
    void deletePermis(String id);
    Permis updatePermis(Permis permis) ;
}
