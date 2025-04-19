package com.example.project3.controllers;

import com.example.project3.models.Group;
import com.example.project3.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired private GroupService groupService;

    @GetMapping public List<Group> getAll() { return groupService.findAll(); }
    @PostMapping public Group create(@RequestBody Group group) { return groupService.save(group); }
}
