package com.example.spproject.Entity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@Inheritance (strategy = InheritanceType.JOINED)

public class Element {
    @Id
    @GeneratedValue
    Long id;

    @OneToMany(targetEntity = Element.class)
    private final List<Element> children = new ArrayList<>();
}