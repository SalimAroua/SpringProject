package tn.esprit.saroua.examensalimaroua.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rencontre {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    LocalDate dateMatch;
    int nbre_but;
    String nomStade;
    @Enumerated(EnumType.STRING)
    Niveau niveau;

    @ManyToOne
    Arbitre arbitre;

    @ManyToOne
    Equipe equipeDomicile;

    @ManyToOne
    Equipe equipeExterieur;
}
