package com.example.project3.services;

import com.example.project3.models.Attachment;
import com.example.project3.repositories.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentService {
    @Autowired private AttachmentRepository attachmentRepository;

    public List<Attachment> findAll() { return attachmentRepository.findAll(); }
    public Attachment save(Attachment attachment) { return attachmentRepository.save(attachment); }
}
