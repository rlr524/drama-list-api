package com.emiyaconsulting.dramalistapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String genreName;

    @ManyToMany
    private Set<Drama> dramas;
}
