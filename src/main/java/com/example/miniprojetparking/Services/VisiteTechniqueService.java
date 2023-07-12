package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Visite_Technique;

import java.util.List;
import java.util.Optional;

public interface VisiteTechniqueService {
    Visite_Technique saveVisite_Technique (Visite_Technique visiteTechnique)  ;
    List<Visite_Technique> getListVisite_Technique();
    Optional<Visite_Technique> findVisite_Technique(String id)  ;
    void deleteVisite_Technique(String id);
    Visite_Technique updateVisite_Technique(Visite_Technique visiteTechnique) ;
}
