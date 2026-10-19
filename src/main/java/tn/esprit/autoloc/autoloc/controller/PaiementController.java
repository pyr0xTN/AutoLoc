package tn.esprit.autoloc.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Paiement;
import tn.esprit.autoloc.autoloc.service.IPaiementService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Paiement")
@Tag(name="gestion de paiement" , description="Crud")
public class PaiementController {
    private final IPaiementService paiementservice;

    @GetMapping("/afficherTousPaiements")
    public List<Paiement> getAllPaiements() {
        return paiementservice.afficherAllPaiements();
    }


    @Operation(summary="Ajouter Paiement")
    @PostMapping("/Ajouterpaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementservice.ajouterPaiement(paiement);
    }

    @PutMapping("/Modifierpaiement")
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementservice.modifierPaiement(paiement);
    }


    @GetMapping("/AfficherPaiement/{id}")
    public Paiement afficherPaiement(@PathVariable Long id) {
        return paiementservice.afficherPaiementById(id);
    }

    @DeleteMapping("/SupprimerPaiement/{id}")
    public void supprimerPaiement(@PathVariable Long id) {
        paiementservice.supprimerPaiement(id);
    }

}