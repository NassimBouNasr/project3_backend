package com.example.project3.controllers;

import com.example.project3.models.Post;
import com.example.project3.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired private PostService postService;

    @GetMapping public List<Post> getAll() { return postService.findAll(); }
    @PostMapping public Post create(@RequestBody Post post) { return postService.save(post); }
}
