package com.example.miniprojetparking.Entities;

import com.example.miniprojetparking.Enums.TypePermis;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_Voiture;
    private TypePermis typePermisVoiture;

    @OneToMany(mappedBy = "voiture")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Voyage> voyage;

    @OneToOne(cascade = CascadeType.ALL)
    private Assurance assurance;

    @OneToOne(cascade = CascadeType.ALL)

    private Visite_Technique visiteTechnique;

    @OneToOne(cascade = CascadeType.ALL)

    private Vignette vignette;

    @OneToOne(cascade = CascadeType.ALL)

    private Carte_Grise carteGrise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Parking parking;

}
