package com.example.demo.student;

import org.hibernate.mapping.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student luci = new Student(
                    1L,
                    "Luci",
                    "luci@gmail.com",
                    LocalDate.of(2002, MAY,9),
                    22
            );
            Student don = new Student(
                    "Don",
                    "don@gmail.com",
                    LocalDate.of(1977, JUNE,23),
                    48
            );
            studentRepository.saveAll(
                    java.util.List.of(luci,don)
            );
        };
    }
}
