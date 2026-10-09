package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule modifierVehicule(Vehicule vehicule);
    Vehicule afficherVehiculeById(Long id);
    List<Vehicule> afficherAllVehicules();
    void supprimerVehicule(Long id);
}
