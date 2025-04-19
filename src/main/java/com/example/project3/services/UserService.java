package com.example.project3.services;

import com.example.project3.models.User;
import com.example.project3.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;

    public List<User> findAll() { return userRepository.findAll(); }
    public Optional<User> findById(Long id) { return userRepository.findById(id); }
    public User save(User user) {
        // Temporarily store password as passwordHash
        user.setPasswordHash(user.getPasswordHash()); // Save the plain text password
        return userRepository.save(user);
    }
    public void deleteById(Long id) { userRepository.deleteById(id); }
    public Optional<User> findByEmail(String email) { return userRepository.findByEmail(email); }
}
