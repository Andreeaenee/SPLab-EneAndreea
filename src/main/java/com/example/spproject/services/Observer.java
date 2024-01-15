package com.example.spproject.services;

import com.example.spproject.Entity.Book;

public interface Observer {
    void update(Book b);
}