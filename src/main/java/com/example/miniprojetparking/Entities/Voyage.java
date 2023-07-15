package com.example.miniprojetparking.Entities;

import com.example.miniprojetparking.Enums.TypeVoyage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CodeVoyage;
    private String Ville_Depart;
    private String Ville_Arrive;
    private LocalDate Date_Debut;
    private LocalDate Date_Fin;
    private int Nombre_Voyageur;
    private TypeVoyage Type_Voyage;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Conducteur conducteur;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    private Voiture voiture;
}
