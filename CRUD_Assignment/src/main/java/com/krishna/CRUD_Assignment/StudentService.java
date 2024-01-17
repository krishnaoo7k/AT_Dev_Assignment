package com.krishna.CRUD_Assignment;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student with id " + id + " not found"));
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }

    public Student updateStudentById(Long id, Student student) {
        if (repository.existsById(id)) {
            student.setId(id);
            return repository.save(student);
        } else {
            throw new EntityNotFoundException("Student with id " + id + " not found");
        }
    }
}