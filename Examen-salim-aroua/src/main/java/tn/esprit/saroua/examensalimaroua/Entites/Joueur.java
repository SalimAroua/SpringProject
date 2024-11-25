package tn.esprit.saroua.examensalimaroua.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String prenom;
    Poste poste;
    int num_maillot;

    @ManyToOne
    Equipe equipe;
}
