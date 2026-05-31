package com.firstIntoSP.first;

// @Component @Service, @Repository     // remove annotation when have Config file
public class Student {

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    public Student(Long id, String firstName, String lastName, String email, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }
}
