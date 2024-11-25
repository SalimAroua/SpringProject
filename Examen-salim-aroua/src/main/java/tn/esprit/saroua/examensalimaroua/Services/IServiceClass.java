package tn.esprit.saroua.examensalimaroua.Services;

import tn.esprit.saroua.examensalimaroua.Entites.Arbitre;
import tn.esprit.saroua.examensalimaroua.Entites.Equipe;
import tn.esprit.saroua.examensalimaroua.Entites.Rencontre;
import tn.esprit.saroua.examensalimaroua.Entites.Test;

public interface IServiceClass {
    String helloWorld();
    Test addTest(Test test);
    Arbitre ajoutArbitre(Arbitre arbitre);
    Equipe ajoutEquipeEtJoueurs(Equipe equipe);
    Rencontre ajoutRencontreEtAffecterEquipes(Rencontre rencontre,Long idEquipe1,Long idEquipe2);
    void affecterArbitreARencontre(String nom,String prenom,Long idR) throws Exception;
    //void rencontreDeDateSys();
}
