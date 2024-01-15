package com.example.spproject.services;
import lombok.RequiredArgsConstructor;
import com.example.spproject.Entity.Book;

@RequiredArgsConstructor

public class CommandGetBookById implements Command {

    private final Long id;

    Book result = null;

    public void execute(CommandContext context) {
        result = context.getBookRepository().findById(id).get();
    }

    public Book getResultBook() {
        return result;
    }
}