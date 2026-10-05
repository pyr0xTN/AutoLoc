package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    Client afficherClientById(Long id);
    List<Client> afficherAllClients();
    void supprimerClient(Long id );
}
