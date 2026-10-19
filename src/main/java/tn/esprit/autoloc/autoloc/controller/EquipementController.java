package tn.esprit.autoloc.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Equipement;
import tn.esprit.autoloc.autoloc.service.IEquipementService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipement")
@Tag(name="gestion de equipement" , description="Crud")
public class EquipementController {
    private final IEquipementService equipementservice;

    @GetMapping("/afficherTousEquipements")
    public List<Equipement> getAllEquipements() {
        return equipementservice.afficherAllEquipements();
    }


    @Operation(summary="Ajouter Equipement")
    @PostMapping("/Ajouterequipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementservice.ajouterEquipement(equipement);
    }

    @PutMapping("/Modifierequipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementservice.modifierEquipement(equipement);
    }


    @GetMapping("/AfficherEquipement/{id}")
    public Equipement afficherEquipement(@PathVariable Long id) {
        return equipementservice.afficherEquipementById(id);
    }

    @DeleteMapping("/SupprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable Long id) {
        equipementservice.supprimerEquipement(id);
    }

}