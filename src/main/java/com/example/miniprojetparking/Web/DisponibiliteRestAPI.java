package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
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
public class DisponibiliteRestAPI {
    private DisponibilitéService disponibilitéService;
    @GetMapping("/disponibles/conducteurs/{dateDebut}/{dateFin}")
    public List<Conducteur> conducteurs(@PathVariable LocalDate dateDebut , LocalDate dateFin)
    {
        return disponibilitéService.ListConducteurDispo(dateDebut, dateFin);
    }
}
