package tn.esprit.autoloc.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Contrat;
import tn.esprit.autoloc.autoloc.service.IContratService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")
@Tag(name="gestion de contrat" , description="Crud")
public class ContratController {
    private final IContratService contratservice;

    @GetMapping("/afficherTousContrats")
    public List<Contrat> getAllContrats() {
        return contratservice.afficherAllContrat();
    }


    @Operation(summary="Ajouter Contrat")
    @PostMapping("/Ajoutercontrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratservice.ajouterContrat(contrat);
    }

    @PutMapping("/Modifiercontrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratservice.modifierContrat(contrat);
    }


    @GetMapping("/AfficherContrat/{id}")
    public Contrat afficherContrat(@PathVariable Long id) {
        return contratservice.afficherContratById(id);
    }

    @DeleteMapping("/SupprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id) {
        contratservice.supprimerContrat(id);
    }

}