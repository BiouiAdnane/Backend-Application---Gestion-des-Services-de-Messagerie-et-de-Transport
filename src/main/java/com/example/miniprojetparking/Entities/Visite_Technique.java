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
    private String code_VisTech;
    private LocalDate date_debut;
    private LocalDate date_Fin;
    private EtatVT etat_Voiture;

    @OneToOne(mappedBy = "visiteTechnique")
    @JoinColumn(name = "code_Voiture")
    private Voiture voiture;
}
