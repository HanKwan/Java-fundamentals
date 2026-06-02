package com.firstIntoSP.first;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class studentController {

    private List<Student> students = new ArrayList<>();

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
       students.add(student);
       return student;
    };

    @GetMapping
    public List<Student> getStudetns() {
        return students;

//        post students without db
//        return List.of(
//                new Student(1L, "John", "Walton", "john@abcmail.com", 23),
//                new Student(2L, "Larry", "Lobster", "larry@abcmail.com", 25)
//        );

    }

}
