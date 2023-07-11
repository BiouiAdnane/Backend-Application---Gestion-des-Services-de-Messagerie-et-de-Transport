package com.example.miniprojetparking.Repositorys;

import com.example.miniprojetparking.Entities.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepo extends JpaRepository<Parking,Integer > {
}
