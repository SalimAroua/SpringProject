package tn.esprit.saroua.examensalimaroua.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nomEquipe;
    LocalDate dateCreation;

    @OneToMany(mappedBy = "equipe",cascade = CascadeType.ALL)
    List<Joueur>joueurs;

    @OneToMany(mappedBy = "equipeDomicile")
    List<Rencontre> rencontresDomiciles;

    @OneToMany(mappedBy = "equipeExterieur")
    List<Rencontre> rencontresExterieur;
}
