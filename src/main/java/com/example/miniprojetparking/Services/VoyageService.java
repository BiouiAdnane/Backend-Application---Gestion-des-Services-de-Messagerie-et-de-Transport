package com.example.miniprojetparking.Services;


import com.example.miniprojetparking.Entities.Voyage;

import java.util.List;
import java.util.Optional;

public interface VoyageService {
    Voyage saveVoyage (Voyage voyage)  ;
    List<Voyage> getListVoyage();
    Optional<Voyage> findVoyage(int id)  ;
    void deleteVoyage(int id);
    Voyage updateVoyage(Voyage voyage) ;
}
