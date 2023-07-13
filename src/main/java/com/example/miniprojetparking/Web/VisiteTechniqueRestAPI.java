package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Visite_Technique;
import com.example.miniprojetparking.Services.ConducteurService;
import com.example.miniprojetparking.Services.VisiteTechniqueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class VisiteTechniqueRestAPI {
    private VisiteTechniqueService visiteTechniqueService;
    @GetMapping("/visiteTechnique")
    public List<Visite_Technique> visiteTechniques(){
        return visiteTechniqueService.getListVisite_Technique();
    }
    @GetMapping("/visiteTechnique/{id}")
    public Optional<Visite_Technique> getVisiteTechnique(@PathVariable String id) {
        return visiteTechniqueService.findVisite_Technique(id);
    }
    @PostMapping("/visiteTechnique")
    public Visite_Technique saveVisiteTechnique(@RequestBody Visite_Technique visiteTechnique){
        return visiteTechniqueService.saveVisite_Technique(visiteTechnique);
    }
    @PutMapping("/visiteTechnique/{id}")
    public Visite_Technique updateVisiteTechnique(@PathVariable String id,@RequestBody Visite_Technique visiteTechnique) {
        visiteTechnique.setCode_VisTech(id);
        return visiteTechniqueService.updateVisite_Technique(visiteTechnique);
    }
    @DeleteMapping("/visiteTechnique/{id}")
    public void deleteVisiteTechnique(@PathVariable String id){
        visiteTechniqueService.deleteVisite_Technique(id);
    }

}
