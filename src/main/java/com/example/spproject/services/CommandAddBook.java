package com.example.spproject.services;
import com.example.spproject.Book;
import lombok.RequiredArgsConstructor;


import java.util.Map;

@RequiredArgsConstructor
public class CommandAddBook implements Command {

    Book result;

    private final Map<String, Object> request;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().createBook(new Book((String) request.get("Titlu")));
    }

    public Book getResults() {
        return result;
    }
}