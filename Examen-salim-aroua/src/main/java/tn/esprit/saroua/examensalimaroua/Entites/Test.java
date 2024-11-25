package tn.esprit.saroua.examensalimaroua.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    // One To One bi (Test child)
    @OneToOne(mappedBy = "test")
    Exam exam;
    // OneToMany - ManyToOne bi
    @ManyToOne
    Exam exam2;
    // ManyToMany bi (Test child)
    @ManyToMany (mappedBy = "testss"/*,fetch = FetchType.EAGER,cascade = CascadeType.ALL*/)
    List<Exam> exames = new ArrayList<Exam>();

}
