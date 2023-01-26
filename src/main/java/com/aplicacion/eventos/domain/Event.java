package com.aplicacion.eventos.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String category;
    @Column
    private float price;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}
