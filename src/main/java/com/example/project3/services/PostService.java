package com.example.project3.services;

import com.example.project3.models.Post;
import com.example.project3.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired private PostRepository postRepository;

    public List<Post> findAll() { return postRepository.findAll(); }
    public Post save(Post post) { return postRepository.save(post); }
}
