package ru.akchi.spring.service;

import org.springframework.stereotype.Service;
import ru.akchi.spring.dto.User;

import java.time.LocalDate;


@Service
public class UserService {

    private User sasha;
    private User nadya;
    private User vera;


    public UserService(
            User nadya,
            User sasha
    ) {
        this.nadya = nadya;
        this.sasha = sasha;
    }

    public void printInfoAboutUsers(){
        vera = new User(
                "Головачёва",
                "Вера",
                "Павловна",
                LocalDate.of(1999,12,13)
        );
        System.out.println("Информация о пользователе sasha : " + sasha);
        System.out.println("Информация о пользователе nadya : " + nadya);
        System.out.println("Информация о пользователе vera : " + vera);
    }

}
