package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Parking;

import java.util.List;
import java.util.Optional;

public interface ParkingService {
    Parking saveParking (Parking parking)  ;
    List<Parking> getListParking();
    Optional<Parking> findParking(int id)  ;
    void deleteParking(int id);
    Parking updateParking(Parking parking) ;
    int countParking();
}
