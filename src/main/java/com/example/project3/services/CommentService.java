package com.example.project3.services;

import com.example.project3.models.Comment;
import com.example.project3.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired private CommentRepository commentRepository;

    public List<Comment> findAll() { return commentRepository.findAll(); }
    public Comment save(Comment comment) { return commentRepository.save(comment); }
}
