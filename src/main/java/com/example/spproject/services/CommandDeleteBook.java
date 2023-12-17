package com.example.spproject.services;

public class CommandDeleteBook implements Command<Void> {

    private BookServices books;
    private Long id;

    @Override
    public Void execute() {
        books.deleteBook(id);
        return null;
    }

    public CommandDeleteBook(BookServices contextBooks) {
        this.books = contextBooks;
    }

    public void setAtribute(Long id){
        this.id = id;
    }
}