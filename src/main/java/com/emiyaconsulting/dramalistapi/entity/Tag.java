package com.emiyaconsulting.dramalistapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String tagName;

    @ManyToMany
    private Set<Drama> dramas;
}
