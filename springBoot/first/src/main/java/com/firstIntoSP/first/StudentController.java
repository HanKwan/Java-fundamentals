package com.firstIntoSP.first;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // create new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
       return studentRepository.save(student);
    };

    // get all students
    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    // get student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
    };

}
