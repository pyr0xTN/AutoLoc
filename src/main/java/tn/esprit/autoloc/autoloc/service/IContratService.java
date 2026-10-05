package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Client;
import tn.esprit.autoloc.autoloc.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContrat(Contrat client);
    Contrat afficherContratById(Long id);
    List<Contrat> afficherAllContrat();
    void supprimerContrat(Long id );
}
