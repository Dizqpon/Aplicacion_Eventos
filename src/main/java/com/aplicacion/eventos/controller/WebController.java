package com.aplicacion.eventos.controller;

import com.aplicacion.eventos.domain.Event;

import java.util.Set;
import org.springframework.ui.Model;
import com.aplicacion.eventos.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/catalog")
    public String catalog(Model model) {
        Set<Event> events = eventService.findAllEvents();
        model.addAttribute("events", events);
        return "catalog";
    }
}
