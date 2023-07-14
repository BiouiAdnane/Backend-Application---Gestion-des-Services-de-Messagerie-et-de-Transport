package com.example.miniprojetparking.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Assurance {
    @Id
    private String code_Assurance;
    private String type_Assurance;
    private LocalDate date_Debut;
    private LocalDate date_Fin;

    @OneToOne(mappedBy = "assurance")
    @JoinColumn(name = "code_Voiture")
    private Voiture voiture;

}
