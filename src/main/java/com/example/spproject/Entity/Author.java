package com.example.spproject.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)

public class Author {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
}