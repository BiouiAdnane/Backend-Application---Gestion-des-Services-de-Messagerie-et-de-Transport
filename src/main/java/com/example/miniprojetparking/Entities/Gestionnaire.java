package com.example.miniprojetparking.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Gestionnaire")
@Entity
public class Gestionnaire extends Personne{

    private String Email;
    private String Mot_de_Passe;
}
