package tn.esprit.saroua.examensalimaroua.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.saroua.examensalimaroua.Entites.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
