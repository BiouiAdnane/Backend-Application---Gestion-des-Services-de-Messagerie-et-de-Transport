package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Assurance;

import java.util.List;
import java.util.Optional;

public interface AssuranceService {
    Assurance saveAssurance (Assurance assurance)  ;
    List<Assurance> getListAssurance();
    Optional<Assurance> findAssurance(String Code_Assurance)  ;
    void deleteAssurance(String Code_Assurance);
    Assurance updateAssurance(Assurance assurance) ;

}
