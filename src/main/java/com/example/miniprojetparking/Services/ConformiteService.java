package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Enums.TypePermis;

import java.time.LocalDate;
import java.util.List;

public interface ConformiteService {
    List<Conducteur> ListConducteurConforme(TypePermis typePermis);
}
