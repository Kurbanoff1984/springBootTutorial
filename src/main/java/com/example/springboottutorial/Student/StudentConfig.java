package com.example.springboottutorial.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            Student sultan = new Student(
                    "Sultan",
                    "Sultan@mail.ru", LocalDate.of(1984, JUNE,
                    28),
                    39
            );

            Student leyla = new Student(
                    "Leyla",
                    "leyla@mail.ru", LocalDate.of(2016, Month.JANUARY,
                    23),
                    7
            );
            Student maga = new Student(
                    "Maga",
                    "Maga@mail.ru", LocalDate.of(2010, Month.MAY,
                    14),
                    14
            );
            studentRepository.saveAll(List.of(sultan, leyla, maga)
            );
        };
    }
}