package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;

import java.util.List;
import java.util.Optional;

public interface ConducteurService {
    Conducteur saveConducteur (Conducteur conducteur)  ;
    List<Conducteur> getListConducteur();
    Optional<Conducteur> findConducteur(String id)  ;
    void deleteConducteur(String id);
    Conducteur updateConducteur(Conducteur conducteur) ;
    List<Conducteur> searchConducteur(String keyword);
    Conducteur findConducteurNumPermis(String Num_Permis);
    int countConducteur();
}
