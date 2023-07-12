package com.example.miniprojetparking.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String Code_Assurance;
    private String Type_Assurance;
    private LocalDate Date_Debut;
    private LocalDate Date_Fin;

}
