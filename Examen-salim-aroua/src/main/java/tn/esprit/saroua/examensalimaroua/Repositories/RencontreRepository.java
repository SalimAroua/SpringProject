package tn.esprit.saroua.examensalimaroua.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.saroua.examensalimaroua.Entites.Rencontre;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface RencontreRepository extends JpaRepository<Rencontre, Long> {
    List<Rencontre> findByDateMatch(LocalDate date);
}
