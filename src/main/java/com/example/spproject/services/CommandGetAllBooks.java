package com.example.spproject.services;
import com.example.spproject.Book;
import java.util.List;

public class CommandGetAllBooks implements Command<List<Book>>{
    private BookServices books;

    public List<Book> execute() {
        return books.getBooks();
    }
    public CommandGetAllBooks(BookServices contextBooks){
        this.books=contextBooks;
    }
}