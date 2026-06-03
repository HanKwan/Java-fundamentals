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

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
       return studentRepository.save(student);
    };

    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{student-name}")
    public Student getStudentById(@PathVariable("student-name") Long id) {
        return studentRepository.findById(id).orElse(null);
    };

//    @GetMapping
//    public List<Student> getStudetns() {
//        return students;
//
//        post students without db
//        return List.of(
//                new Student(1L, "John", "Walton", "john@abcmail.com", 23),
//                new Student(2L, "Larry", "Lobster", "larry@abcmail.com", 25)
//        );
//
//    }

}
