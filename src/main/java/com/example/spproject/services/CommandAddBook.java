package com.example.spproject.services;
import com.example.spproject.Book;
public class CommandAddBook implements Command<Book>{
    private Book book;
    private BookServices books;
    public CommandAddBook(BookServices books){
        this.books = books;
    }
    @Override
    public Book execute(){
        return books.createBook(book);
    }
    public void setAtributte(Book book){
        this.book = book;
    }
}
