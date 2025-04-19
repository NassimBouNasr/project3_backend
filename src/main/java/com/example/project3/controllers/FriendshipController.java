package com.example.project3.controllers;

import com.example.project3.models.Friendship;
import com.example.project3.models.User;
import com.example.project3.services.FriendshipService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friends")
public class FriendshipController {
    @Autowired private FriendshipService friendshipService;

    @GetMapping
    public List<User> getFriends(HttpSession session) {
        User currentUser = (User) session.getAttribute("user");
        if (currentUser == null) return List.of();
        return friendshipService.findAcceptedFriends(currentUser);
    }

    @PostMapping
    public void addFriend(@RequestBody User friend, HttpSession session) {
        User currentUser = (User) session.getAttribute("user");
        if (currentUser == null) return;

        var friendship = new Friendship();
        friendship.setUser(currentUser);
        friendship.setFriend(friend);
        friendship.setStatus("pending");
        friendshipService.save(friendship);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        friendshipService.deleteById(id);
    }
}
