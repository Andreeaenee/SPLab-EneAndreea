package com.example.spproject.services;
import lombok.RequiredArgsConstructor;
import com.example.spproject.Book;

import java.util.List;

@RequiredArgsConstructor
public class CommandGetAllBooks implements Command {
    List<Book> result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().getBooks();
    }

    public List<Book> getResults() {
        return result;
    }
}