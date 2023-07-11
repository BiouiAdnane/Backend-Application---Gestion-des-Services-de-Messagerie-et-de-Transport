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
public class Repos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_Repos;
    private LocalDate date_Debut;
    private LocalDate date_Fin;
    @ManyToOne(fetch = FetchType.LAZY)
    private Conducteur conducteur;
}
