package com.example.project3.services;

import com.example.project3.models.PostAttachment;
import com.example.project3.repositories.PostAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostAttachmentService {
    @Autowired private PostAttachmentRepository postAttachmentRepository;

    public List<PostAttachment> findAll() { return postAttachmentRepository.findAll(); }
    public PostAttachment save(PostAttachment postAttachment) { return postAttachmentRepository.save(postAttachment); }
}
