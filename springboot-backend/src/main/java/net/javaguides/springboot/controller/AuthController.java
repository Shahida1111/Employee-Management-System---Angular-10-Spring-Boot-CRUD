package net.javaguides.springboot.controller;

import net.javaguides.springboot.dto.UserResponse;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody User user) {

        User registeredUser = userService.registerUser(user);

        UserResponse response =
                new UserResponse(registeredUser.getId(), registeredUser.getEmail());

        return ResponseEntity.status(201).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> login(
            @RequestBody User user) {

        User loggedInUser =
                userService.loginUser(
                        user.getEmail(),
                        user.getPassword()
                );

        UserResponse response =
                new UserResponse(
                        loggedInUser.getId(),
                        loggedInUser.getEmail()
                );

        return ResponseEntity.ok(response);
    }
}
