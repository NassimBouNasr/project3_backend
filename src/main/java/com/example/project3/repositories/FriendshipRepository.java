package com.example.project3.repositories;

import com.example.project3.models.Friendship;
import com.example.project3.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendshipRepository extends JpaRepository<Friendship, Long> {
    List<Friendship> findByUserAndStatus(User user, String status);
    List<Friendship> findByFriendAndStatus(User friend, String status);
}
