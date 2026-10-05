package tn.esprit.autoloc.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc.domain.Contrat;
import tn.esprit.autoloc.autoloc.repository.ContratRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class IContratServiceImp implements IContratService {
    private ContratRepository contratRepository;
    @Override
    public Contrat ajouterClient(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modifierClient(Contrat client) {
        return contratRepository.save(client);
    }

    @Override
    public Contrat afficherClientById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> afficherAllClients() {
        return contratRepository.findAll();
    }

    @Override
    public void supprimerClient(Long id) {
        contratRepository.deleteById(id);

    }
}
