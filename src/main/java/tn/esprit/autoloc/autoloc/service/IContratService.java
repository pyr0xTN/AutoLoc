package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Client;
import tn.esprit.autoloc.autoloc.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterClient(Contrat contrat);
    Contrat modifierClient(Contrat client);
    Contrat afficherClientById(Long id);
    List<Contrat> afficherAllClients();
    void supprimerClient(Long id );
}
