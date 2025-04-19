package com.example.project3.controllers;

import com.example.project3.models.GroupMessage;
import com.example.project3.services.GroupMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group-messages")
public class GroupMessageController {
    @Autowired private GroupMessageService groupMessageService;

    @GetMapping public List<GroupMessage> getAll() { return groupMessageService.findAll(); }
    @PostMapping public GroupMessage create(@RequestBody GroupMessage message) { return groupMessageService.save(message); }
}
