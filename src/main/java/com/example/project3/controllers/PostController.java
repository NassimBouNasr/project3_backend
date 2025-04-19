package com.example.project3.controllers;

import com.example.project3.models.Post;
import com.example.project3.models.User;
import com.example.project3.services.PostService;
import com.example.project3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    // Get all posts
    @GetMapping
    public List<Post> getAll() {
        return postService.findAll();
    }

    // Create a new post
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Post post, HttpSession session) {
        // Get user ID from session
        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            // If user is not logged in, return an unauthorized response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Not logged in");
        }

        // Find the user by ID
        Optional<User> userOpt = userService.findById(userId);
        if (userOpt.isEmpty()) {
            // If user is not found, return an unauthorized response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found");
        }

        // Set the author of the post to the logged-in user
        post.setAuthor(userOpt.get());
        post.setCreatedAt(LocalDateTime.now()); // Ensure post creation time is set (optional)

        // Save the post
        Post savedPost = postService.save(post);

        // Return the saved post as the response
        return ResponseEntity.ok(savedPost);
    }
}
