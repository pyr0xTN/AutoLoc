package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    Equipement afficherEquipementById(Long id);
    List<Equipement> afficherAllEquipements();
    void supprimerEquipement(Long id);
}
