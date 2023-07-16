package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Gestionnaire;
import com.example.miniprojetparking.Services.ConducteurService;
import com.example.miniprojetparking.Services.GestionnaireService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class GestionnaireRestAPI {
    private GestionnaireService gestionnaireService;
    @GetMapping("/gestionnaires")
    public List<Gestionnaire> gestionnaires(){
        return gestionnaireService.getListGestionnaire();
    }
    @GetMapping("/gestionnaires/{id}")
    public Optional<Gestionnaire> getGestionnaire(@PathVariable String id) {
        return gestionnaireService.findGestionnaire(id);
    }
    @PostMapping("/gestionnaires")
    public Gestionnaire saveConducteur(@RequestBody Gestionnaire gestionnaire){
        return gestionnaireService.saveGestionnaire(gestionnaire);
    }
    @PutMapping("/gestionnaires/{id}")
    public Gestionnaire updateGestionnaire(@PathVariable String id,@RequestBody Gestionnaire gestionnaire) {
        gestionnaire.setMatricule(id);
        return gestionnaireService.updateGestionnaire(gestionnaire);
    }
    @DeleteMapping("/gestionnaires/{id}")
    public void deleteGestionnaire(@PathVariable String id){
        gestionnaireService.deleteGestionnaire(id);
    }


    @GetMapping("/gestionnaires/search")
    public List<Gestionnaire> searchGestionnaire(@RequestParam(name = "keyword" , defaultValue = "") String keyword){
        return gestionnaireService.searchGestionnaire("%"+keyword+"%");
    }
    @GetMapping("/gestionnaires/count")
    public int countGestionnaire(){
        return gestionnaireService.countGestionnaire();
    }
}
