package tn.esprit.kaddem.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.kaddem.DAO.Entites.Contrat;
import tn.esprit.kaddem.Services.IContratService;

@RestController
public class ContratRestController {
    @Autowired
    private IContratService ics;
    @PostMapping("/addContrat")
    //type de mapping
    public Contrat ajouterContrat(@RequestBody Contrat c){
        return ics.addContrat(c);
    }
}
