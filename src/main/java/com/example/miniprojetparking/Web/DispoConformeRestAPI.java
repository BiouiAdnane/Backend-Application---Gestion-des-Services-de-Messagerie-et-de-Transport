package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Services.ConformiteService;
import com.example.miniprojetparking.Services.DispoConformeService;
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
public class DispoConformeRestAPI {
    private DispoConformeService dispoConformeService;
    @GetMapping("/dispoConforme/conducteurs/{typePermis}/{dateDebut}/{dateFin}")
    public List<Conducteur> conducteurs(@PathVariable LocalDate dateDebut, @PathVariable LocalDate dateFin, @PathVariable String typePermis)
    {
        return dispoConformeService.ListConducteurDispoConforme(dateDebut, dateFin , typePermis);
    }

    @GetMapping("/dispoConforme/vehicules/{typePermis}/{dateDebut}/{dateFin}")
    public List<Voiture> vehicules(@PathVariable LocalDate dateDebut, @PathVariable LocalDate dateFin, @PathVariable String typePermis)
    {
        return dispoConformeService.ListVehiculeDispoConforme(dateDebut, dateFin , typePermis);
    }
}
