package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
             Student miriam = new Student(

                    "mariam","mariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)

            );
            Student Alex = new Student(

                    "Alex","alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 5)

            );
            studentRepository.saveAll(
                    List.of(miriam, Alex)
            );
        };
    }
}
