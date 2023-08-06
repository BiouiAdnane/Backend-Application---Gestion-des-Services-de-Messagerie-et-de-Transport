package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Voyage;
import com.example.miniprojetparking.Services.ConducteurService;
import com.example.miniprojetparking.Services.VoyageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class VoyageRestAPI {
    private VoyageService voyageService;
    @GetMapping("/voyages/search")
    public List<Voyage> searchVoyage(@RequestParam(name = "keyword" , defaultValue = "") String keyword){
        return voyageService.searchVoyage("%"+keyword+"%");
    }
    @GetMapping("/voyages/{id}")
    public Optional<Voyage> getVoyage(@PathVariable int id) {
        return voyageService.findVoyage(id);
    }
    @PostMapping("/voyages")
    public Voyage saveVoyage(@RequestBody Voyage voyage){
        return voyageService.saveVoyage(voyage);
    }
    @PutMapping("/voyages/{id}")
    public Voyage updateVoyage(@PathVariable int id,@RequestBody Voyage voyage) {
        voyage.setCodeVoyage(id);
        return voyageService.updateVoyage(voyage);
    }
    @DeleteMapping("/voyages/{id}")
    public void deleteVoyage(@PathVariable int id){
        voyageService.deleteVoyage(id);
    }

}
