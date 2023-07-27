package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Services.ConducteurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ConducteurRestAPI {
    private ConducteurService conducteurService;
    @GetMapping("/conducteurs")
    public List<Conducteur> conducteurs(){
        return conducteurService.getListConducteur();
    }
    @GetMapping("/conducteurs/{id}")
    public Optional<Conducteur> getConducteur(@PathVariable String id) {
        return conducteurService.findConducteur(id);
    }
    @PostMapping("/conducteurs")
    public Conducteur saveConducteur(@RequestBody Conducteur conducteur){
        return conducteurService.saveConducteur(conducteur);
    }
    @PutMapping("/conducteurs/{id}")
    public Conducteur updateConducteur(@PathVariable String id,@RequestBody Conducteur conducteur) {
        conducteur.setMatricule(id);
        return conducteurService.updateConducteur(conducteur);
    }
    @DeleteMapping("/conducteurs/{id}")
    public void deleteConducteur(@PathVariable String id){
        conducteurService.deleteConducteur(id);
    }

    @GetMapping("/conducteurPermis/{Num_Permis}")
    public Conducteur getConducteurByPermis(@PathVariable String Num_Permis) {
        return conducteurService.findConducteurNumPermis(Num_Permis);
    }

    @GetMapping("/conducteurs/search")
    public List<Conducteur> searchConducteur(@RequestParam(name = "keyword" , defaultValue = "") String keyword){
        return conducteurService.searchConducteur("%"+keyword+"%");
    }
    @GetMapping("/conducteurs/count")
    public int countArticle(){
        return conducteurService.countConducteur();
    }
}
