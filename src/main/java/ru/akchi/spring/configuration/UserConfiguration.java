package ru.akchi.spring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.akchi.spring.dto.User;

import java.time.LocalDate;

@Configuration
public class UserConfiguration {

    @Bean
    public User nadya() {
        return new User(
                "Головачёва",
                "Надежда",
                "Павловна",
                LocalDate.of(1995, 8, 19)
        );
    }

    @Bean
    public User sasha() {
        return new User(
                "Чичов",
                "Александр",
                "Константинович",
                LocalDate.of(1995, 11, 16)
        );
    }
}
