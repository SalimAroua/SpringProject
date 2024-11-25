package tn.esprit.saroua.examensalimaroua.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@org.aspectj.lang.annotation.Aspect
public class AspectClass {
    @After("execution(* tn.esprit.saroua.examensalimaroua.Services..*(..))")
    public void afficher(){
        log.info("Service has been executed");
    }
    @AfterThrowing("execution(* tn.esprit.saroua.examensalimaroua.Services.IServiceClass.affecterArbitreARencontre(..))")
    public void AffecterArbitreARencontre(){
        log.warn("Il faut affecter un arbitre de meme niveau aue la rencontre");
    }

}
