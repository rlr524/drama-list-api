package com.emiyaconsulting.dramalistapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Drama {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;

    private String dramaName;

    private int year;

    private float rating;

    private String imageURL;

    private int genreID;

    private int countryID;

    private int tagID;
}
