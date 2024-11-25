package tn.esprit.saroua.examensalimaroua.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.saroua.examensalimaroua.Entites.Arbitre;
import tn.esprit.saroua.examensalimaroua.Entites.Equipe;
import tn.esprit.saroua.examensalimaroua.Entites.Rencontre;
import tn.esprit.saroua.examensalimaroua.Entites.Test;
import tn.esprit.saroua.examensalimaroua.Repositories.*;

import java.time.LocalDate;

@Service
@AllArgsConstructor
@Slf4j
public class ServiceClass implements IServiceClass{
    ArbitreRepository arbitreRepository;
    JoueurRepository joueurRepository;
    EquipeRepository equipeRepository;
    RencontreRepository rencontreRepository;
    TestRepository testRepository;
    @Override
    public String helloWorld() {
        return "Hello! 3CINFOGL1";
    }

    @Override
    public Test addTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public Arbitre ajoutArbitre(Arbitre arbitre) {
        return arbitreRepository.save(arbitre);
    }

    @Override
    public Equipe ajoutEquipeEtJoueurs(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Rencontre ajoutRencontreEtAffecterEquipes(Rencontre rencontre, Long idEquipe1, Long idEquipe2) {
        rencontreRepository.save(rencontre);
        rencontre.setEquipeDomicile(equipeRepository.findById(idEquipe1).get());
        rencontre.setEquipeExterieur(equipeRepository.findById(idEquipe2).get());
        rencontre.setNbre_but(0);
        return rencontreRepository.save(rencontre);
    }

    @Override
    public void affecterArbitreARencontre(String nom, String prenom, Long idR) throws Exception {
        throw new java.lang.Exception("Exception declanchee");
    }
   /* @Scheduled
    @Override
    public void rencontreDeDateSys() {
        LocalDate today = LocalDate.now();
        Rencontre rencontre =rencontreRepository.findByDateMatch(today).get(0);
        log.info("les rencontres d'aujourd'hui");
        log.info("Rencontre entre"+rencontre.getEquipeDomicile()+" et "+rencontre.getEquipeExterieur() + " a "+ rencontre.getNomStade());

    }*/
}
