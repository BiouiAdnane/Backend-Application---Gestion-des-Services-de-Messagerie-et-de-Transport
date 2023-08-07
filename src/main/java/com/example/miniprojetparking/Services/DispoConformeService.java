package com.example.miniprojetparking.Services;


import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;

import java.time.LocalDate;
import java.util.List;

public interface DispoConformeService {

    List<Conducteur> ListConducteurDispoConforme(LocalDate dateDebut, LocalDate dateFin, String typePermis);
    List<Voiture> ListVehiculeDispoConforme(LocalDate dateDebut, LocalDate dateFin, String typePermis);
}
