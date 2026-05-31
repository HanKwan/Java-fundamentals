package com.firstIntoSP.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {

    @GetMapping("/students")
    public List<Student> getStudetns() {
        return List.of(
                new Student(1L, "John", "Walton", "john@abcmail.com", 23)
        );
    }

}
