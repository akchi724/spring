package ru.akchi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.akchi.spring.service.UserService;

@RestController
@RequestMapping("/public/user/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/info")
    public void printInfoAboutUsers(){
        userService.printInfoAboutUsers();
    }
}
