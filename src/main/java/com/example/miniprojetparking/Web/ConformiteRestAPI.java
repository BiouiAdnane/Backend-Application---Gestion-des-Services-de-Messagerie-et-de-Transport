package com.example.miniprojetparking.Web;


import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Enums.TypePermis;
import com.example.miniprojetparking.Services.ConformiteService;
import com.example.miniprojetparking.Services.DisponibilitéService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ConformiteRestAPI {
    private ConformiteService conformiteService;
    @GetMapping("/conforme/conducteurs/{typePermis}")
    public List<Conducteur> conducteurs(@PathVariable TypePermis typePermis) {
        return conformiteService.ListConducteurConforme(typePermis);
    }
}
