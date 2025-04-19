package com.example.project3.controllers;

import com.example.project3.models.Event;
import com.example.project3.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired private EventService eventService;

    @GetMapping public List<Event> getAll() { return eventService.findAll(); }
    @PostMapping public Event create(@RequestBody Event event) { return eventService.save(event); }
}
