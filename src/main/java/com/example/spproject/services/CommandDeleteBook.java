package com.example.spproject.services;

import lombok.RequiredArgsConstructor;
import com.example.spproject.Entity.Book;

@RequiredArgsConstructor
public class CommandDeleteBook implements Command {

    private final Long id;

    public void execute(CommandContext context) {
        context.getBookRepository().deleteById(id);
    }
}