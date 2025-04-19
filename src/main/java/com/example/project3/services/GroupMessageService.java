package com.example.project3.services;

import com.example.project3.models.GroupMessage;
import com.example.project3.repositories.GroupMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMessageService {
    @Autowired private GroupMessageRepository groupMessageRepository;

    public List<GroupMessage> findAll() { return groupMessageRepository.findAll(); }
    public GroupMessage save(GroupMessage groupMessage) { return groupMessageRepository.save(groupMessage); }
}
