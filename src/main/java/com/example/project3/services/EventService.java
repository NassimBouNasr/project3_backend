package com.example.project3.services;

import com.example.project3.models.Event;
import com.example.project3.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired private EventRepository eventRepository;

    public List<Event> findAll() { return eventRepository.findAll(); }
    public Event save(Event event) { return eventRepository.save(event); }
}
