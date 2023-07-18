package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;

import java.time.LocalDate;
import java.util.List;

public interface DisponibilitéService {
    List<Conducteur> ListConducteurDispo(LocalDate dateDebut, LocalDate dateFin);
    List<Voiture> ListVehiculeDispo(LocalDate dateDebut, LocalDate dateFin);
}
