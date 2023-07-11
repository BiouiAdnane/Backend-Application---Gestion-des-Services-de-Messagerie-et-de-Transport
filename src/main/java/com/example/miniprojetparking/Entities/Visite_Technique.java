package com.example.miniprojetparking.Entities;

import com.example.miniprojetparking.Enums.EtatVT;
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
public class Visite_Technique {
    @Id
    private String Code_VisTech;
    private LocalDate Date_debut;
    private LocalDate Date_Fin;
    private EtatVT Etat_Voiture;
}
