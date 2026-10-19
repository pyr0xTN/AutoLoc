package tn.esprit.autoloc.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Client;
import tn.esprit.autoloc.autoloc.service.IClientService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")
@Tag(name="gestion de client" , description="Crud")
public class ClientController {
    private final IClientService clientservice;

    @GetMapping("/afficherTousClients")
    public List<Client> getAllClients() {
        return clientservice.afficherAllClients();
    }


    @Operation(summary="Ajouter Client")
    @PostMapping("/Ajouterclient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientservice.ajouterClient(client);
    }

    @PutMapping("/Modifierclient")
    public Client modifierClient(@RequestBody Client client) {
        return clientservice.modifierClient(client);
    }


    @GetMapping("/AfficherClient/{id}")
    public Client afficherClient(@PathVariable Long id) {
        return clientservice.afficherClientById(id);
    }

    @DeleteMapping("/SupprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id) {
        clientservice.supprimerClient(id);
    }

}