package com.example.project3.controllers;

import com.example.project3.models.*;
import com.example.project3.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteById(id);
    }

    // ---------------------- LOGIN ----------------------
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginUser, HttpSession session) {
        Optional<User> userOpt = userService.findByEmail(loginUser.getEmail());

        if (userOpt.isPresent()) {
            User storedUser = userOpt.get();

            // Debug: log both passwords
            logger.info("🔐 Incoming password: {}", loginUser.getPasswordHash());
            logger.info("🔐 Stored password: {}", storedUser.getPasswordHash());

            // Compare stored password with incoming password
            if (storedUser.getPasswordHash().equals(loginUser.getPasswordHash())) {
                session.setAttribute("userId", storedUser.getId());
                return ResponseEntity.ok(storedUser);
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials AHH");
    }


    // ---------------------- LOGOUT ----------------------
    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpSession session) {
        session.invalidate();
        return ResponseEntity.ok("Logged out successfully");
    }
}
