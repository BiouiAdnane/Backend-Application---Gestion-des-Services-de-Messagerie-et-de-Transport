package com.example.miniprojetparking.Entities;

import com.example.miniprojetparking.Enums.TypeCarburant;
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
public class Carte_Grise {
    @Id
    private String num_Immatricualtion;
    private LocalDate date_Debut;
    private LocalDate date_Fin;
    private String nom_Proprietaire;
    private int nombre_Place;
    private String marque;
    private String model;
    private TypeCarburant typeCarburant;

    /*@OneToOne(mappedBy = "carteGrise")
    @JoinColumn(name = "code_Voiture")
    private Voiture voiture;*/

}
