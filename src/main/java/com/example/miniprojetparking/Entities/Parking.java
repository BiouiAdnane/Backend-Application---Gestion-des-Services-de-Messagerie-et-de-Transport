package com.example.miniprojetparking.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NumParking;
    private String Ville;
    private String Adresse;
    private int NombreMax;
    private int NombreActuel;
    @OneToMany(mappedBy = "parking")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Voiture> voiture;
}
