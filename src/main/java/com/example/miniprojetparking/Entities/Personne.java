package com.example.miniprojetparking.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 14 , discriminatorType = DiscriminatorType.STRING)
@Entity
public class Personne {
    @Id
    private String CIN;
    private String Matricule;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private LocalDate Date_Naissance;
    private String NumTel;
};
