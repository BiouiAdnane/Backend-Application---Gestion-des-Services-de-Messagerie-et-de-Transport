package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Carte_Grise;
import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Services.CarteGriseService;
import com.example.miniprojetparking.Services.ConducteurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class CarteGriseRestAPI {
    private CarteGriseService carteGriseService;
    @GetMapping("/carteGrise")
    public List<Carte_Grise> carteGrises(){
        return carteGriseService.getListCarte_Grise();
    }
    @GetMapping("/carteGrise/{id}")
    public Optional<Carte_Grise> getCarteGrise(@PathVariable String id) {
        return carteGriseService.findCarte_Grise(id);
    }
    @PostMapping("/carteGrise")
    public Carte_Grise saveCarteGrise(@RequestBody Carte_Grise carteGrise){
        return carteGriseService.saveCarte_Grise(carteGrise);
    }
    @PutMapping("/carteGrise/{id}")
    public Carte_Grise updateCarteGrise(@PathVariable String id,@RequestBody Carte_Grise carteGrise) {
        carteGrise.setNum_Immatricualtion(id);
        return carteGriseService.updateCarte_Grise(carteGrise);
    }
    @DeleteMapping("/carteGrise/{id}")
    public void deleteCarteGrise(@PathVariable String id){
        carteGriseService.deleteCarte_Grise(id);
    }

}
