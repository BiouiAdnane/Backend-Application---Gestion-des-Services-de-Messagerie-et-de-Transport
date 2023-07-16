package com.example.miniprojetparking;

import com.example.miniprojetparking.Entities.*;
import com.example.miniprojetparking.Enums.EtatVT;
import com.example.miniprojetparking.Enums.TypeCarburant;
import com.example.miniprojetparking.Enums.TypePermis;
import com.example.miniprojetparking.Enums.TypeVoyage;
import com.example.miniprojetparking.Repositorys.*;
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

    @Bean
    CommandLineRunner start(
                            ConducteurRepo conducteurRepo,
                            PermisRepo permisRepo,
                            AssuranceRepo assuranceRepo,
                            Carte_GriseRepo carteGriseRepo,
                            GestionnaireRepo gestionnaireRepo,
                            ParkingRepo parkingRepo,
                            ReposRepo reposRepo,
                            VignetteRepo vignetteRepo,
                            VisiteTechniqueRepo visiteTechniqueRepo,
                            VoitureRepo voitureRepo,
                            VoyageRepo voyageRepo
                            ) {
        return args -> {

                //Permis
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



                //Conducteur
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



                //Gestionnaire
                Gestionnaire gestionnaire1 =new Gestionnaire();
                gestionnaire1.setCIN("FE345098");
                gestionnaire1.setMatricule("G001");
                gestionnaire1.setNom("Saadaoui");
                gestionnaire1.setPrenom("Youssef");
                gestionnaire1.setAdresse("adresse");
                gestionnaire1.setDate_Naissance(LocalDate.of(2000,2,20));
                gestionnaire1.setNumTel("06 45 00 00 00");
                gestionnaire1.setEmail("youssef.saadaoui@gmail.com");
                gestionnaire1.setMot_de_Passe("youss2000");
                gestionnaireRepo.save(gestionnaire1);

                Gestionnaire gestionnaire2 =new Gestionnaire();
                gestionnaire2.setCIN("TG344320");
                gestionnaire2.setMatricule("G002");
                gestionnaire2.setNom("Jamouli");
                gestionnaire2.setPrenom("yassine");
                gestionnaire2.setAdresse("adresse");
                gestionnaire2.setDate_Naissance(LocalDate.of(2000,2,20));
                gestionnaire2.setNumTel("06 45 00 00 00");
                gestionnaire2.setEmail("yassine.jamouli@gmail.com");
                gestionnaire2.setMot_de_Passe("yassineJM");
                gestionnaireRepo.save(gestionnaire2);



                // Assurance
                Assurance assurance1 = new Assurance();
                assurance1.setCode_Assurance("AssuranceC01");
                assurance1.setType_Assurance("Normal");
                assurance1.setDate_Debut(LocalDate.of(2022,7,20));
                assurance1.setDate_Fin(LocalDate.of(2023,7,20));
                assuranceRepo.save(assurance1);

                Assurance assurance2 = new Assurance();
                assurance2.setCode_Assurance("AssuranceC02");
                assurance2.setType_Assurance("Tout risque");
                assurance2.setDate_Debut(LocalDate.of(2023,6,20));
                assurance2.setDate_Fin(LocalDate.of(2024,6,20));
                assuranceRepo.save(assurance2);

                Assurance assurance3 = new Assurance();
                assurance3.setCode_Assurance("AssuranceC03");
                assurance3.setType_Assurance("Normal");
                assurance3.setDate_Debut(LocalDate.of(2022,12,20));
                assurance3.setDate_Fin(LocalDate.of(2023,12,20));
                assuranceRepo.save(assurance3);

                //Carte Grise
                Carte_Grise carteGrise1 = new Carte_Grise();
                carteGrise1.setNum_Immatricualtion("Carte01");
                carteGrise1.setDate_Debut(LocalDate.of(2022,12,20));
                carteGrise1.setDate_Fin(LocalDate.of(2032,12,20));
                carteGrise1.setModel("Sprinter");
                carteGrise1.setMarque("Mercedess");
                carteGrise1.setNom_Proprietaire("Entreprise");
                carteGrise1.setNombre_Place(24);
                carteGrise1.setTypeCarburant(TypeCarburant.Essence);
                carteGriseRepo.save(carteGrise1);

                Carte_Grise carteGrise2 = new Carte_Grise();
                carteGrise2.setNum_Immatricualtion("Carte02");
                carteGrise2.setDate_Debut(LocalDate.of(2020,12,20));
                carteGrise2.setDate_Fin(LocalDate.of(2030,12,20));
                carteGrise2.setModel("i8");
                carteGrise2.setMarque("Irizar");
                carteGrise2.setNom_Proprietaire("Entreprise");
                carteGrise2.setNombre_Place(56);
                carteGrise2.setTypeCarburant(TypeCarburant.Diesel);
                carteGriseRepo.save(carteGrise2);

                Carte_Grise carteGrise3 = new Carte_Grise();
                carteGrise3.setNum_Immatricualtion("Carte03");
                carteGrise3.setDate_Debut(LocalDate.of(2018,12,20));
                carteGrise3.setDate_Fin(LocalDate.of(2028,12,20));
                carteGrise3.setModel("VM");
                carteGrise3.setMarque("Volvo");
                carteGrise3.setNom_Proprietaire("Entreprise");
                carteGrise3.setNombre_Place(2);
                carteGrise3.setTypeCarburant(TypeCarburant.Essence);
                carteGriseRepo.save(carteGrise3);

                // Vignette
                Vignette vignette1 = new Vignette();
                vignette1.setDate_Debut(LocalDate.of(2023,5,20));
                vignette1.setDate_Fin(LocalDate.of(2024,5,20));
                vignetteRepo.save(vignette1);

                Vignette vignette2 = new Vignette();
                vignette2.setDate_Debut(LocalDate.of(2023,6,20));
                vignette2.setDate_Fin(LocalDate.of(2024,6,20));
                vignetteRepo.save(vignette2);

                Vignette vignette3 = new Vignette();
                vignette3.setDate_Debut(LocalDate.of(2023,3,20));
                vignette3.setDate_Fin(LocalDate.of(2024,3,20));
                vignetteRepo.save(vignette3);


                //Visite Technique
                Visite_Technique visiteTechnique1 = new Visite_Technique();
                visiteTechnique1.setCode_VisTech("VisC001");
                visiteTechnique1.setDate_debut(LocalDate.of(2023,5,20));
                visiteTechnique1.setDate_Fin(LocalDate.of(2024,5,20));
                visiteTechnique1.setEtat_Voiture(EtatVT.Conforme);
                visiteTechniqueRepo.save(visiteTechnique1);

                Visite_Technique visiteTechnique2 = new Visite_Technique();
                visiteTechnique2.setCode_VisTech("VisC002");
                visiteTechnique2.setDate_debut(LocalDate.of(2023,6,20));
                visiteTechnique2.setDate_Fin(LocalDate.of(2024,6,20));
                visiteTechnique2.setEtat_Voiture(EtatVT.Conforme);
                visiteTechniqueRepo.save(visiteTechnique2);

                Visite_Technique visiteTechnique3 = new Visite_Technique();
                visiteTechnique3.setCode_VisTech("VisC003");
                visiteTechnique3.setDate_debut(LocalDate.of(2023,3,20));
                visiteTechnique3.setDate_Fin(LocalDate.of(2024,3,20));
                visiteTechnique3.setEtat_Voiture(EtatVT.Conforme);
                visiteTechniqueRepo.save(visiteTechnique3);


                //Parking
                Parking parking= new Parking();
                parking.setAdresse("Casablanca Ouled Ziane");
                parking.setVille("Casablanca");
                parking.setNombreMax(20);
                parking.setNombreActuel(0);
                parkingRepo.save(parking);

                //Voiture
                Voiture voiture1=new Voiture();
                voiture1.setCode_Voiture(1);
                voiture1.setAssurance(assurance1);
                voiture1.setVignette(vignette1);
                voiture1.setVisiteTechnique(visiteTechnique1);
                voiture1.setCarteGrise(carteGrise1);
                voiture1.setTypePermisVoiture(TypePermis.B);
                voiture1.setParking(parking);
                voitureRepo.save(voiture1);


                Voiture voiture2=new Voiture();
                voiture2.setCode_Voiture(2);
                voiture2.setAssurance(assurance2);
                voiture2.setVignette(vignette2);
                voiture2.setVisiteTechnique(visiteTechnique2);
                voiture2.setCarteGrise(carteGrise2);
                voiture2.setTypePermisVoiture(TypePermis.D);
                voiture2.setParking(parking);
                voitureRepo.save(voiture2);

                Voiture voiture3=new Voiture();
                voiture3.setCode_Voiture(3);
                voiture3.setAssurance(assurance3);
                voiture3.setVignette(vignette3);
                voiture3.setVisiteTechnique(visiteTechnique3);
                voiture3.setCarteGrise(carteGrise3);
                voiture3.setTypePermisVoiture(TypePermis.C);
                voiture3.setParking(parking);
                voitureRepo.save(voiture3);

                //Voyage
                Voyage voyage1 = new Voyage();
                voyage1.setDate_Debut(LocalDate.of(2023,8,1));
                voyage1.setDate_Fin(LocalDate.of(2023,8,16));
                voyage1.setType_Voyage(TypeVoyage.Transport_Personne);
                voyage1.setConducteur(conducteur1);
                voyage1.setNombre_Voyageur(15);
                voyage1.setVoiture(voiture1);
                voyage1.setVille_Depart("Casablanca");
                voyage1.setVille_Arrive("Tanger");
                voyageRepo.save(voyage1);


                //Repos
                Repos repos1 = new Repos();
                repos1.setConducteur(conducteur2);
                repos1.setDate_Debut(LocalDate.of(2023,8,1));
                repos1.setDate_Fin(LocalDate.of(2023,8,13));
                reposRepo.save(repos1);

                Repos repos2 = new Repos();
                repos2.setConducteur(conducteur3);
                repos2.setDate_Debut(LocalDate.of(2023,7,17));
                repos2.setDate_Fin(LocalDate.of(2023,7,19));
                reposRepo.save(repos2);



        };
    }
}