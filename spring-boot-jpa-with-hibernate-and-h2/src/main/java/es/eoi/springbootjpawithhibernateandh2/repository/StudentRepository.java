package es.eoi.springbootjpawithhibernateandh2.repository;

import es.eoi.springbootjpawithhibernateandh2.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
