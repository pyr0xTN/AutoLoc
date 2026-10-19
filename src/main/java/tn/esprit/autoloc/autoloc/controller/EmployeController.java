package tn.esprit.autoloc.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Employe;
import tn.esprit.autoloc.autoloc.service.IEmployeService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Employe")
@Tag(name="gestion de employe" , description="Crud")
public class EmployeController {
    private final IEmployeService employeservice;

    @GetMapping("/afficherTousEmployes")
    public List<Employe> getAllEmployes() {
        return employeservice.afficherAllEmployes();
    }


    @Operation(summary="Ajouter Employe")
    @PostMapping("/Ajouteremploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeservice.ajouterEmploye(employe);
    }

    @PutMapping("/Modifieremploye")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeservice.modifierEmploye(employe);
    }


    @GetMapping("/AfficherEmploye/{id}")
    public Employe afficherEmploye(@PathVariable Long id) {
        return employeservice.afficherEmployeById(id);
    }

    @DeleteMapping("/SupprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id) {
        employeservice.supprimerEmploye(id);
    }

}