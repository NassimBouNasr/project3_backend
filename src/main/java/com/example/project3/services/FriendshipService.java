package com.example.project3.services;

import com.example.project3.models.Friendship;
import com.example.project3.repositories.FriendshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendshipService {
    @Autowired private FriendshipRepository friendshipRepository;

    public List<Friendship> findAll() { return friendshipRepository.findAll(); }
    public Friendship save(Friendship friendship) { return friendshipRepository.save(friendship); }
    public void deleteById(Long id) { friendshipRepository.deleteById(id); }

}
