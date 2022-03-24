package com.example.demo.model;

import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Jan = new Student(
                    "Jan",
                    "jan.kowalski@gmail.com",
                    LocalDate.of(2000, JANUARY, 1)
            );

            Student Marcin = new Student(
                    "Marcin",
                    "Marcin.kowalczyk@gmail.com",
                    LocalDate.of(2001, MAY, 21)
            );

            repository.saveAll(
                    List.of(Jan, Marcin)
            );
        };
    }
}
