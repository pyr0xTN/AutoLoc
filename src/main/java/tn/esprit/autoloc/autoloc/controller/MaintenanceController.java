package tn.esprit.autoloc.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Maintenance;
import tn.esprit.autoloc.autoloc.service.IMaintenanceService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Maintenance")
@Tag(name="gestion de maintenance" , description="Crud")
public class MaintenanceController {
    private final IMaintenanceService maintenanceservice;

    @GetMapping("/afficherToutesMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceservice.afficherAllMaintenances();
    }


    @Operation(summary="Ajouter Maintenance")
    @PostMapping("/Ajoutermaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceservice.ajouterMaintenance(maintenance);
    }

    @PutMapping("/Modifiermaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceservice.modifierMaintenance(maintenance);
    }


    @GetMapping("/AfficherMaintenance/{id}")
    public Maintenance afficherMaintenance(@PathVariable Long id) {
        return maintenanceservice.afficherMaintenanceById(id);
    }

    @DeleteMapping("/SupprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id) {
        maintenanceservice.supprimerMaintenance(id);
    }

}