package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Permis;
import com.example.miniprojetparking.Services.ConducteurService;
import com.example.miniprojetparking.Services.PermisService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class PermisRestAPI {
    private PermisService permisService;
    @GetMapping("/permis")
    public List<Permis> permisList(){
        return permisService.getListPermis();
    }
    @GetMapping("/permis/{id}")
    public Optional<Permis> getPermis(@PathVariable String id) {
        return permisService.findPermis(id);
    }
    @PostMapping("/permis")
    public Permis savePermis(@RequestBody Permis permis){
        return permisService.savePermis(permis);
    }
    @PutMapping("/permis/{id}")
    public Permis updatePermis(@PathVariable String id,@RequestBody Permis permis) {
        permis.setNum_Permis(id);
        return permisService.updatePermis(permis);
    }
    @DeleteMapping("/permis/{id}")
    public void deletePermis(@PathVariable String id){
        permisService.deletePermis(id);
    }

}
