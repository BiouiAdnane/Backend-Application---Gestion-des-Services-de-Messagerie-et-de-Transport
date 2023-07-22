package com.example.miniprojetparking.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Permis {
    @Id
    private String Num_Permis;
    private LocalDate Date_Delivrance;
    private LocalDate Date_Fin;
    private String Lieu_Delivrance;
    @ElementCollection
    private List<String> typePermisList;}
