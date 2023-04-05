package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student nguyen =  new Student(
                    1L,
                    "Nguyen",
                    "NguyenLe@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 5)
            );

            Student ngan =  new Student(
                    2L,
                    "Ngan",
                    "NganPham@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(nguyen, ngan)
            );

        };
    }
}
