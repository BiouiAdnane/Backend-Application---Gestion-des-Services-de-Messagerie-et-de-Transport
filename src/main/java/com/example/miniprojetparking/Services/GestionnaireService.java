package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Gestionnaire;

import java.util.List;
import java.util.Optional;

public interface GestionnaireService {
    Gestionnaire saveGestionnaire (Gestionnaire gestionnaire)  ;
    List<Gestionnaire> getListGestionnaire();
    Optional<Gestionnaire> findGestionnaire(int id)  ;
    void deleteGestionnaire(int id);
    Gestionnaire updateGestionnaire(Gestionnaire gestionnaire) ;
    List<Gestionnaire> searchGestionnaire(String keyword);
    int countGestionnaire();
}
