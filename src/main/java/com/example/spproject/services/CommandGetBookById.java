package com.example.spproject.services;
import com.example.spproject.Book;
public class CommandGetBookById implements Command<Book> {
    private BookServices books;
    private Long id;
    @Override
    public Book execute() {
        return books.getBookById(id);
    }
    public CommandGetBookById(BookServices contextBooks)
    {
        this.books = contextBooks;
    }
    public void setId(Long id) {
        this.id = id;
    }
}