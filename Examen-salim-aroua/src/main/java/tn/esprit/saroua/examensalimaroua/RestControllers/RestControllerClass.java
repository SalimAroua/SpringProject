package tn.esprit.saroua.examensalimaroua.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.saroua.examensalimaroua.Entites.Arbitre;
import tn.esprit.saroua.examensalimaroua.Entites.Equipe;
import tn.esprit.saroua.examensalimaroua.Entites.Rencontre;
import tn.esprit.saroua.examensalimaroua.Entites.Test;
import tn.esprit.saroua.examensalimaroua.Services.IServiceClass;

@RestController
@AllArgsConstructor
public class RestControllerClass {
    IServiceClass iServiceClass;

    @GetMapping("helloWorld")
    public String helloWorld(){
        return iServiceClass.helloWorld();
    }
    @PostMapping("add")
    public Test add(Test test){
        return iServiceClass.addTest(test);
    }
    @PostMapping("ajoutArbitre")
    Arbitre ajoutArbitre(@RequestBody Arbitre arbitre){
        return iServiceClass.ajoutArbitre(arbitre);
    }
    @PostMapping("ajoutEquipeEtJoueurs")
    Equipe ajoutEquipeEtJoueurs(@RequestBody Equipe equipe){
        return iServiceClass.ajoutEquipeEtJoueurs(equipe);
    }
    @PostMapping("ajoutRencontreEtAffecterEquipes")
    public Rencontre ajoutRencontreEtAffecterEquipes(@RequestBody Rencontre rencontre, @RequestParam Long idEquipe1, @RequestParam Long idEquipe2){
        return iServiceClass.ajoutRencontreEtAffecterEquipes(rencontre,idEquipe1,idEquipe2);
    }
    @GetMapping("affecterArbitreARencontre")
    void affecterArbitreARencontre(String nom,String prenom,Long idR) throws Exception{

    }

}
