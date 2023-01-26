package com.aplicacion.eventos.service;

import com.aplicacion.eventos.domain.Event;
import java.util.Set;

public interface EventService {
    Set<Event> findAllEvents();
    Set<Event> findAllEvents(String category);
    void increasePrice(Event event);
}
