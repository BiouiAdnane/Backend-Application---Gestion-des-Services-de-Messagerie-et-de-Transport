package com.example.miniprojetparking.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@DiscriminatorValue("Conducteur")
@NoArgsConstructor
@Entity
public class Conducteur extends Personne{

    @OneToOne(cascade = CascadeType.ALL)
    private Permis permis;
    @OneToMany(mappedBy = "conducteur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Voyage> voyage;
    @OneToMany(mappedBy = "conducteur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Repos> reposList;
}
