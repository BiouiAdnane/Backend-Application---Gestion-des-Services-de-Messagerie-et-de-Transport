package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Vignette;
import com.example.miniprojetparking.Services.ConducteurService;
import com.example.miniprojetparking.Services.VignetteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class VignetteRestAPI {
    private VignetteService vignetteService;
    @GetMapping("/vignettes")
    public List<Vignette> vignettes(){
        return vignetteService.getListVignette();
    }
    @GetMapping("/vignettes/{id}")
    public Optional<Vignette> getVignette(@PathVariable int id) {
        return vignetteService.findVignette(id);
    }
    @PostMapping("/vignettes")
    public Vignette saveVignette(@RequestBody Vignette vignette){
        return vignetteService.saveVignette(vignette);
    }
    @PutMapping("/vignettes/{id}")
    public Vignette updateVignette(@PathVariable int id,@RequestBody Vignette vignette) {
        vignette.setCode_Vignette(id);
        return vignetteService.updateVignette(vignette);
    }
    @DeleteMapping("/vignettes/{id}")
    public void deleteVignette(@PathVariable int id){
        vignetteService.deleteVignette(id);
    }

}
