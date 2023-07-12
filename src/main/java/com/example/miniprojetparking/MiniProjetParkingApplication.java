package com.example.miniprojetparking;

import com.example.miniprojetparking.Entities.Conducteur;
import com.example.miniprojetparking.Entities.Permis;
import com.example.miniprojetparking.Entities.Personne;
import com.example.miniprojetparking.Enums.TypePermis;
import com.example.miniprojetparking.Repositorys.ConducteurRepo;
import com.example.miniprojetparking.Repositorys.PermisRepo;
import com.example.miniprojetparking.Repositorys.PersonneRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class MiniProjetParkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniProjetParkingApplication.class, args);
    }

    //@Bean
    CommandLineRunner start(PersonneRepo personneRepo,
                            ConducteurRepo conducteurRepo,
                            PermisRepo permisRepo
                            ) {
        return args -> {
            Stream.of("Adnan", "Ahmed", "Mourad").forEach(name -> {

                Permis permis1 = new Permis();
                permis1.setNum_Permis("51/285502");
                permis1.setTypePermisList(Arrays.asList(TypePermis.B, TypePermis.C, TypePermis.D));
                permis1.setDate_Delivrance(LocalDate.of(2020,9,7));
                permis1.setDate_Fin(LocalDate.of(2030,9,21));
                permis1.setLieu_Delivrance("Casablanca");
                permisRepo.save(permis1);

                Permis permis2 = new Permis();
                permis2.setNum_Permis("46/894029");
                permis2.setTypePermisList(Arrays.asList(TypePermis.B, TypePermis.C));
                permis2.setDate_Delivrance(LocalDate.of(2021,5,17));
                permis2.setDate_Fin(LocalDate.of(2031,5,29));
                permis2.setLieu_Delivrance("Boujdour");
                permisRepo.save(permis2);

                Permis permis3 = new Permis();
                permis3.setNum_Permis("23/454523");
                permis3.setTypePermisList(Arrays.asList(TypePermis.B,TypePermis.EB));
                permis3.setDate_Delivrance(LocalDate.of(2018,4,7));
                permis3.setDate_Fin(LocalDate.of(2028,4,25));
                permis3.setLieu_Delivrance("Settat");
                permisRepo.save(permis3);



                Conducteur conducteur1 = new Conducteur();
                conducteur1.setCIN("BV590");
                conducteur1.setMatricule("C01");
                conducteur1.setNom("Bioui");
                conducteur1.setPrenom("Adnane");
                conducteur1.setPermis(permis1);
                conducteur1.setAdresse("Casablanca");
                conducteur1.setNumTel("06 23 00 00 00");
                conducteur1.setReposList(null);
                conducteur1.setVoyage(null);
                conducteur1.setDate_Naissance(LocalDate.of(2001,7,20));
                conducteurRepo.save(conducteur1);

                Conducteur conducteur2 = new Conducteur();
                conducteur2.setCIN("JF214530");
                conducteur2.setMatricule("C02");
                conducteur2.setNom("El Idrissi");
                conducteur2.setPrenom("Ahmed");
                conducteur2.setPermis(permis2);
                conducteur2.setAdresse("Agadir");
                conducteur2.setNumTel("06 23 00 00 00");
                conducteur2.setReposList(null);
                conducteur2.setVoyage(null);
                conducteur2.setDate_Naissance(LocalDate.of(2001,9,2));
                conducteurRepo.save(conducteur2);

                Conducteur conducteur3 = new Conducteur();
                conducteur3.setCIN("SA1015");
                conducteur3.setMatricule("C03");
                conducteur3.setNom("Mannasse");
                conducteur3.setPrenom("Mourad");
                conducteur3.setPermis(permis3);
                conducteur3.setAdresse("Marakech");
                conducteur3.setNumTel("06 23 00 00 00");
                conducteur3.setReposList(null);
                conducteur3.setVoyage(null);
                conducteur3.setDate_Naissance(LocalDate.of(2000,2,20));
                conducteurRepo.save(conducteur3);

            });
        };
    }
}