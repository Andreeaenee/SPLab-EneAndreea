package com.example.spproject.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)

public class Book {
    @Id
    @GeneratedValue
    Long id;
    @ManyToMany
    private List<Author> authors;


}