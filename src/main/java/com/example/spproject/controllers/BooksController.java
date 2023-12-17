package com.example.spproject.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.spproject.services.*;
import com.example.spproject.*;
import org.springframework.web.bind.annotation.*;


import java.util.*;


@RestController
@RequestMapping("/books")
public class BooksController {
    private BookServices books = new BookServices();
    CommandAddBook addBook;
    CommandUpdateBook updateBook;
    CommandDeleteBook deleteBook;
    CommandGetAllBooks getAll;
    CommandGetBookById getBookById;


    public BooksController() {
        this.addBook = new CommandAddBook(books);
        this.updateBook = new CommandUpdateBook(books);
        this.deleteBook = new CommandDeleteBook(books);
        this.getAll = new CommandGetAllBooks(books);
        this.getBookById = new CommandGetBookById(books);
    }

    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        addBook.setAtributte(newBook);
        return addBook.execute();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        this.updateBook.setAtribute(id, updatedBook);
        return this.updateBook.execute();
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        this.deleteBook.setAtribute(id);
        this.deleteBook.execute();
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return getAll.execute();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        this.getBookById.setId(id);
        return getBookById.execute();
    }
}