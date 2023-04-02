package tn.esprit.kaddem.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.DAO.Entites.Contrat;
import tn.esprit.kaddem.DAO.Repositories.ContratRepo;

@Service
public class ContratService implements IContratService{
    @Autowired

    // or @Inject = new ContratRepository()
    private ContratRepo cr;

    @Override
    public Contrat addContrat(Contrat c) {
        return cr.save(c);
    }
}
