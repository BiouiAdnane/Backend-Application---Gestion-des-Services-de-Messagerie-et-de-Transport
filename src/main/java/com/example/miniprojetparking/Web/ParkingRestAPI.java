package com.example.miniprojetparking.Web;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Parking;
import com.example.miniprojetparking.Services.ConducteurService;
import com.example.miniprojetparking.Services.ParkingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ParkingRestAPI {
    private ParkingService parkingService;
    @GetMapping("/parking")
    public List<Parking> parkings(){
        return parkingService.getListParking();
    }
    @GetMapping("/parking/{id}")
    public Optional<Parking> getParking(@PathVariable int id) {
        return parkingService.findParking(id);
    }
    @PostMapping("/parking")
    public Parking saveParking(@RequestBody Parking parking){
        return parkingService.saveParking(parking);
    }
    @PutMapping("/parking/{id}")
    public Parking updateParking(@PathVariable int id,@RequestBody Parking parking) {
        parking.setNumParking(id);
        return parkingService.updateParking(parking);
    }
    @DeleteMapping("/parking/{id}")
    public void deleteParking(@PathVariable int id){
        parkingService.deleteParking(id);
    }


}
