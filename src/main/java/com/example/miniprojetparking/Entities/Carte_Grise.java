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
    private String Num_Immatricualtion;
    private LocalDate Date_Debut;
    private LocalDate Date_Fin;
    private String Nom_Proprietaire;
    private int Nombre_Place;
    private String Marque;
    private String Model;
    private TypeCarburant TypeCarburant;

}
