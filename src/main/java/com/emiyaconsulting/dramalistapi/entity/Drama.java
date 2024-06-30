package com.emiyaconsulting.dramalistapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dramas")
@Data
public class Drama {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "drama_name")
    private String dramaName;
    @Column(name = "year")
    private int year;
    @Column(name = "rating")
    private float rating;
    @Column(name = "image_url")
    private String imageURL;
    @Column(name = "genre_id")
    private int genreID;
    @Column(name = "country_id")
    private int countryID;
    @Column(name = "tag_id")
    private int tagID;
}
