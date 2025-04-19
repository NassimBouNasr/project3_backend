package com.example.project3.controllers;

import com.example.project3.models.Comment;
import com.example.project3.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired private CommentService commentService;

    @GetMapping public List<Comment> getAll() { return commentService.findAll(); }
    @PostMapping public Comment create(@RequestBody Comment comment) { return commentService.save(comment); }
}
