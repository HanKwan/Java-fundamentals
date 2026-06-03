package com.firstIntoSP.first;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByFirstNameContainingOrLastNameContaining(
            String firstName,
            String lastName
    );

}
