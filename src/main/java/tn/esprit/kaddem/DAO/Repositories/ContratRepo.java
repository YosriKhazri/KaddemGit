package tn.esprit.kaddem.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddem.DAO.Entites.Contrat;

@Repository
public interface ContratRepo extends CrudRepository<Contrat,Long> {
}
