package com.example.demo.Student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long Id;
    private String Name;
    private Integer Age;
    private LocalDate Dob;
    private String Email;

    public Student()
    {}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        this.Age = age;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate dob) {
        this.Dob = dob;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public Student(Long id, String name, Integer age, LocalDate dob, String email) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Dob = dob;
        this.Email = email;
    }
    public Student(String name, Integer age, LocalDate dob, String email) {
        this.Name = name;
        this.Age = age;
        this.Dob = dob;
        this.Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Dob=" + Dob +
                ", Email='" + Email + '\'' +
                '}';
    }
}
