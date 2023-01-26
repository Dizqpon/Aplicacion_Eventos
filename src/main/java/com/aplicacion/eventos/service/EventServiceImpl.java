package com.aplicacion.eventos.service;

import com.aplicacion.eventos.repository.EventRepository;
import java.util.Set;
import com.aplicacion.eventos.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public Set<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Set<Event> findAllEvents(String category) {
        return null;
    }

    @Override
    public void increasePrice(Event event) {

    }

}
