package ru.akchi.spring.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    private String surname;

    private String firstName;

    private String patronymicName;

    private LocalDate birthday;

    public User(String surname, String firstName, String patronymicName, LocalDate birthday) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
