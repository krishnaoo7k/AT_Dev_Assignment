package com.krishna.CRUD_Assignment;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/student")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        service.deleteStudentById(id);
    }

    @PutMapping("/students/{id}")
    public Student updateStudentById(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudentById(id, student);
    }
}