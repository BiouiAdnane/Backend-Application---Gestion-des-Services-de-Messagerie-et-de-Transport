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
@Entity
public class Vignette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_Vignette;
    private LocalDate date_Debut;
    private LocalDate date_Fin;
/*
    @OneToOne(mappedBy = "vignette")
    @JoinColumn(name = "code_Voiture")
    private Voiture voiture;*/
}
