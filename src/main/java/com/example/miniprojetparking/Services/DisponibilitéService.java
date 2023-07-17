package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;

import java.time.LocalDate;
import java.util.List;

public interface DisponibilitéService {
    List<Conducteur> ListConducteurDispo(LocalDate dateDebut, LocalDate dateFin);
}
