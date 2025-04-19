package com.example.project3.services;

import com.example.project3.models.Group;
import com.example.project3.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired private GroupRepository groupRepository;

    public List<Group> findAll() { return groupRepository.findAll(); }
    public Group save(Group group) { return groupRepository.save(group); }
}
