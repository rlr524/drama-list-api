package com.emiyaconsulting.dramalistapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Drama {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "drama_name")
    private String dramaName;
}
