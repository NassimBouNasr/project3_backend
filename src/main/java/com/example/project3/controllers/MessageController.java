package com.example.project3.controllers;

import com.example.project3.models.Message;
import com.example.project3.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired private MessageService messageService;

    @GetMapping public List<Message> getAll() { return messageService.findAll(); }
    @PostMapping public Message create(@RequestBody Message message) { return messageService.save(message); }
}
