package com.example.project3.services;

import com.example.project3.models.GroupMember;
import com.example.project3.repositories.GroupMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMemberService {
    @Autowired private GroupMemberRepository groupMemberRepository;

    public List<GroupMember> findAll() { return groupMemberRepository.findAll(); }
    public GroupMember save(GroupMember groupMember) { return groupMemberRepository.save(groupMember); }
}
