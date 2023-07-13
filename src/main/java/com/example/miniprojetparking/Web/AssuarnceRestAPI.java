package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Assurance;
import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Services.AssuranceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class AssuarnceRestAPI {
    private AssuranceService assuranceService;
    @GetMapping("/assurances")
    public List<Assurance> assurances(){
        return assuranceService.getListAssurance();
    }
    @GetMapping("/assurances/{id}")
    public Optional<Assurance> getAssurance(@PathVariable String id) {
        return assuranceService.findAssurance(id);
    }
    @PostMapping("/assurances")
    public Assurance saveAssurance(@RequestBody Assurance assurance){
        return assuranceService.saveAssurance(assurance);
    }
    @PutMapping("/assurances/{id}")
    public Assurance updateAssurance(@PathVariable String id,@RequestBody Assurance assurance) {
        assurance.setCode_Assurance(id);
        return assuranceService.updateAssurance(assurance);
    }
    @DeleteMapping("/assurances/{id}")
    public void deleteAssurance(@PathVariable String id){
        assuranceService.deleteAssurance(id);
    }

}
