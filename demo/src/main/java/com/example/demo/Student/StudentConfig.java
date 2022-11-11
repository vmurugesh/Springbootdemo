package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)    {
        return args -> {
           Student murugesh = new Student("Murugesh", 23, LocalDate.of(2003, Month.NOVEMBER, 11), "murugesh74@gmail.com");
           Student john = new Student(
                   "John", 23, LocalDate.of(2003, Month.DECEMBER, 1), "john74@gmail.com");

            repository.saveAll(List.of(murugesh,john));
        };
    }
}
