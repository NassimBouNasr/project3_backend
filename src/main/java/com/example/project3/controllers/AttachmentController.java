package com.example.project3.controllers;

import com.example.project3.models.Attachment;
import com.example.project3.services.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attachments")
public class AttachmentController {
    @Autowired private AttachmentService attachmentService;

    @GetMapping public List<Attachment> getAll() { return attachmentService.findAll(); }
    @PostMapping public Attachment upload(@RequestBody Attachment attachment) { return attachmentService.save(attachment); }
}
