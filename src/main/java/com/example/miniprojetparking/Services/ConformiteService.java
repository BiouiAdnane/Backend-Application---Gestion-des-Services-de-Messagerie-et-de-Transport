package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;

import java.time.LocalDate;
import java.util.List;

public interface ConformiteService {
    List<Conducteur> getListConducteurConforme(String typePermis);
    List<Voiture> getListeVoituresConformesParTypePermis(String typePermis, LocalDate dateDebut, LocalDate dateFin);
}
