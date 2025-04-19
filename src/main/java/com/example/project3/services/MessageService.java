package com.example.project3.services;

import com.example.project3.models.Message;
import com.example.project3.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired private MessageRepository messageRepository;

    public List<Message> findAll() { return messageRepository.findAll(); }
    public Message save(Message message) { return messageRepository.save(message); }
}
