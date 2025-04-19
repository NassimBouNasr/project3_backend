package com.example.project3.services;

import com.example.project3.models.MessageAttachment;
import com.example.project3.repositories.MessageAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageAttachmentService {
    @Autowired private MessageAttachmentRepository messageAttachmentRepository;

    public List<MessageAttachment> findAll() { return messageAttachmentRepository.findAll(); }
    public MessageAttachment save(MessageAttachment messageAttachment) { return messageAttachmentRepository.save(messageAttachment); }
}
