package com.aplicacion.eventos.repository;

import com.aplicacion.eventos.domain.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    Set<Event> findAll();
    Event findByName(String name);
    Set<Event> findByNameAndPrice(String name, float price);
}
