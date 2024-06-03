package Student_CRUD.Practice_03_06_24.repo;

import Student_CRUD.Practice_03_06_24.entiry.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}