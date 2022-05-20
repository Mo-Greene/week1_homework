package com.example.week1_homework;

import com.example.week1_homework.domain.Person;
import com.example.week1_homework.domain.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week1HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week1HomeworkApplication.class, args);
    }

    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {
            Person person = new Person("장티", "신길로29", 29, "꿈돌이");
            repository.save(person);
        };
    }
}
