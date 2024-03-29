package com.example.spproject.services;
import com.example.spproject.Entity.Book;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandUpdateBook implements Command {

    private final Long id;
    private final Book book; //copie
    Book result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().save(book);
    }

    public Book getResults() {
        return result;
    }
}