package com.example.miniprojetparking.Entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Gestionnaire extends Personne{
    private int Code_Gest;
    private String Email;
    private String Mot_de_Passe;
}
