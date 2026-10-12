package tn.esprit.autoloc.autoloc.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Agence;
import tn.esprit.autoloc.autoloc.domain.Vehicule;
import tn.esprit.autoloc.autoloc.service.IAgenceService;



import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Agence")

public class AgenceController {
    private IAgenceService agenceService;
    @GetMapping("/afficherToutesagences")
    public List<Agence> getAllAgence() {
        return agenceService.afficherAllAgences();

    }

    @PostMapping("/Ajouteragence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);

    }
    @PutMapping("/Modifieragence")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }
    @GetMapping("/AfficherAgence/{id}")
    public Agence afficherAgence(@PathVariable Long id) {
        return agenceService.afficherAgenceById(id);
    }

    @DeleteMapping("/SupprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id) {
        agenceService.supprimerAgence(id);
    }
}
