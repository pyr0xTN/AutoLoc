package tn.esprit.autoloc.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Vehicule;
import tn.esprit.autoloc.autoloc.service.IVehiculeService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicule")
public class VehiculeController {
    private final IVehiculeService vehiculeservice;
    @GetMapping("/afficherToutesVehicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeservice.afficherAllVehicules();

    }



    @PostMapping("/Ajoutervehicule")
public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeservice.ajouterVehicule(vehicule);

}
@PutMapping("/Modifiervehicule")
public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeservice.modifierVehicule(vehicule);
}


@GetMapping("/AfficherVehicule/{id}")
    public Vehicule afficherVehicule(@PathVariable Long id) {
        return vehiculeservice.afficherVehiculeById(id);
}

@DeleteMapping("/SupprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeservice.supprimerVehicule(id);
}

}
