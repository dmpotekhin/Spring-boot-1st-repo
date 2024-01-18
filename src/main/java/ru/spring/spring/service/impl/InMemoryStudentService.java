package ru.spring.spring.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.spring.spring.model.Student;
import ru.spring.spring.repository.InMemoryStudentDAO;
import ru.spring.spring.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudents() {
       return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {

        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {

        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {

        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);

    }
}
