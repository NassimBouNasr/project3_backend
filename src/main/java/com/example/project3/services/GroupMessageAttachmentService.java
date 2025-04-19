package com.example.project3.services;

import com.example.project3.models.GroupMessageAttachment;
import com.example.project3.repositories.GroupMessageAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMessageAttachmentService {
    @Autowired private GroupMessageAttachmentRepository groupMessageAttachmentRepository;

    public List<GroupMessageAttachment> findAll() { return groupMessageAttachmentRepository.findAll(); }
    public GroupMessageAttachment save(GroupMessageAttachment groupMessageAttachment) { return groupMessageAttachmentRepository.save(groupMessageAttachment); }
}
