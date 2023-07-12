package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Carte_Grise;

import java.util.List;
import java.util.Optional;

public interface CarteGriseService {
    Carte_Grise saveCarte_Grise (Carte_Grise carteGrise)  ;
    List<Carte_Grise> getListCarte_Grise();
    Optional<Carte_Grise> findCarte_Grise(String id)  ;
    void deleteCarte_Grise(String id);
    Carte_Grise updateCarte_Grise(Carte_Grise carteGrise) ;
}
