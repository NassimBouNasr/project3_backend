package com.example.project3.controllers;

import com.example.project3.models.GroupMember;
import com.example.project3.services.GroupMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group-members")
public class GroupMemberController {
    @Autowired private GroupMemberService groupMemberService;

    @GetMapping public List<GroupMember> getAll() { return groupMemberService.findAll(); }
    @PostMapping public GroupMember create(@RequestBody GroupMember groupMember) { return groupMemberService.save(groupMember); }
}
