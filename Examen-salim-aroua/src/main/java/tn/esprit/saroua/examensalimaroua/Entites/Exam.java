package tn.esprit.saroua.examensalimaroua.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class    Exam {
    @Id
    long id;

    // One To One bi (Test child)
    @OneToOne
    Test test;
    // OneToMany - ManyToOne bi : Celui qui a la cardinalité la plus faible ==> Child
    @OneToMany(mappedBy = "exam2")
    List<Test> tests;
    // ManyToMany bi
    @ManyToMany
    List<Test> testss;
}
