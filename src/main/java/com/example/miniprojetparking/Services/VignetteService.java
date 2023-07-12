package com.example.miniprojetparking.Services;

import com.example.miniprojetparking.Entities.Vignette;

import java.util.List;
import java.util.Optional;

public interface VignetteService {
    Vignette saveVignette (Vignette vignette)  ;
    List<Vignette> getListVignette();
    Optional<Vignette> findVignette(int id)  ;
    void deleteVignette(int id);
    Vignette updateVignette(Vignette vignette) ;
}
