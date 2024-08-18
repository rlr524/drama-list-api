package com.emiyaconsulting.dramalistapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "drama")
@Data
public class Drama {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String dramaName;

    private int year;

    private float rating;

    private String imageURL;

    private int countryID;

    private int episodes;

    @ManyToMany
    private Set<Genre> genres;

    @ManyToMany
    private Set<Tag> tags;
}
