package com.example.Hackentine.Service;

import com.example.Hackentine.Entity.EventEntity;
import com.example.Hackentine.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    
    @Autowired
    private EventRepository eventRepository;
    
    public List<EventEntity> getAllEvents() {
        return eventRepository.findAll();
    }
    
    public Optional<EventEntity> getEventById(Long id) {
        return eventRepository.findById(id);
    }
    
    public EventEntity saveEvent(EventEntity event) {
        return eventRepository.save(event);
    }
    
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
