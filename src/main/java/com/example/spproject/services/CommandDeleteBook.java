package com.example.spproject.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandDeleteBook implements Command {

    private final Long id;

    public void execute(CommandContext context) {
        context.getBookRepository().deleteBook(id);
    }
}