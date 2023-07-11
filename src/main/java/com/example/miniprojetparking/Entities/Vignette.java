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
    private int Code_Vignette;
    private LocalDate Date_Debut;
    private LocalDate Date_Fin;
}
