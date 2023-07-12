package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Parking;
import com.example.miniprojetparking.Repositorys.ParkingRepo;

import java.util.List;
import java.util.Optional;

public class ParkingServiceImpl implements ParkingService{
    private ParkingRepo parkingRepo;
    @Override
    public Parking saveParking(Parking parking) {
        return parkingRepo.save(parking);
    }

    @Override
    public List<Parking> getListParking() {
        return parkingRepo.findAll();
    }

    @Override
    public Optional<Parking> findParking(int id) {
        return parkingRepo.findById(id);
    }

    @Override
    public void deleteParking(int id) {
        parkingRepo.deleteById(id);
    }

    @Override
    public Parking updateParking(Parking parking) {
        return parkingRepo.save(parking);
    }

    @Override
    public int countParking() {
        return 0;
    }
}
