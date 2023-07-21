package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Services.ConformiteService;
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
    @GetMapping("/conformes/conducteurs/{typePermis}")
    public List<Conducteur> conducteurs(@PathVariable String typePermis )
    {
        return conformiteService.getListConducteurConforme(typePermis);
    }

    @GetMapping("/conformes/vehicules/{typePermis}/{dateDebut}/{dateFin}")
    public List<Voiture> vehicules(@PathVariable LocalDate dateDebut, @PathVariable LocalDate dateFin, @PathVariable String typePermis)
    {
        return conformiteService.getListeVoituresConforme(dateDebut, dateFin , typePermis);
    }
}
