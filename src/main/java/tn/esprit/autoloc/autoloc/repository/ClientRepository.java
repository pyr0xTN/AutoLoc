package tn.esprit.autoloc.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc.domain.Client;
@Repository

public interface ClientRepository extends JpaRepository<Client,Long> {

}
