package tn.esprit.saroua.examensalimaroua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamenSalimArouaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenSalimArouaApplication.class, args);
    }

}
