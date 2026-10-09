package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    Paiement afficherPaiementById(Long id);
    List<Paiement> afficherAllPaiements();
    void supprimerPaiement(Long id);
}
