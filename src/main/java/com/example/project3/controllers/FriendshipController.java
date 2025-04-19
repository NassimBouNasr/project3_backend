package com.example.project3.controllers;

import com.example.project3.models.Friendship;
import com.example.project3.services.FriendshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friends")
public class FriendshipController {
    @Autowired private FriendshipService friendshipService;

    @GetMapping public List<Friendship> getAll() { return friendshipService.findAll(); }
    @PostMapping public Friendship add(@RequestBody Friendship friendship) { return friendshipService.save(friendship); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { friendshipService.deleteById(id); }
}
