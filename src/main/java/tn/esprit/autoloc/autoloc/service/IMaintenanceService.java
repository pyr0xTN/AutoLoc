package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance afficherMaintenanceById(Long id);
    List<Maintenance> afficherAllMaintenances();
    void supprimerMaintenance(Long id);
}
