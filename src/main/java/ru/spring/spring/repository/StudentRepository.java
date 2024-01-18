package ru.spring.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.spring.spring.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);

    Student findStudentByEmail(String email);
}
