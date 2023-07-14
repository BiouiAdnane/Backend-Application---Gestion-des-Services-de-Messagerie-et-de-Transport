package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Voiture;
import com.example.miniprojetparking.Services.VoitureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class VoitureRestAPI {
    private VoitureService voitureService;
    @GetMapping("/voitures")
    public List<Voiture> voitures(){
        return voitureService.getListVoiture();
    }
    @GetMapping("/voitures/{id}")
    public Optional<Voiture> getConducteur(@PathVariable int id) {
        return voitureService.findVoiture(id);
    }
    @PostMapping("/voitures")
    public Voiture saveVoiture(@RequestBody Voiture voiture){
        return voitureService.saveVoiture(voiture);
    }
    @PutMapping("/voitures/{id}")
    public Voiture updateVoiture(@PathVariable int id,@RequestBody Voiture voiture) {
        voiture.setCode_Voiture(id);
        return voitureService.updateVoiture(voiture);
    }
    @DeleteMapping("/voitures/{id}")
    public void deleteVoiture(@PathVariable int id){
        voitureService.deleteVoiture(id);
    }

}
