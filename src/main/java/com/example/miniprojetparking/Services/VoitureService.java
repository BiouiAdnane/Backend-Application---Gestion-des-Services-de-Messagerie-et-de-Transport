package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Voiture;

import java.util.List;
import java.util.Optional;

public interface VoitureService {
    Voiture saveVoiture (Voiture voiture)  ;
    List<Voiture> getListVoiture();
    Optional<Voiture> findVoiture(int id)  ;
    void deleteVoiture(int id);
    Voiture updateVoiture(Voiture voiture) ;
}
