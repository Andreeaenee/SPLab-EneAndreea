package com.example.spproject.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.spproject.services.*;
import org.springframework.web.bind.annotation.*;
import com.example.spproject.Entity.Book;

import java.util.*;


@RestController
@RequestMapping("/books")
@RequiredArgsConstructor(onConstructor_ = @Autowired)

public class BooksController {
    private final CommandContext context;

    private final AsyncExecutor asyncExecutor;

    private final SyncExecutor syncExecutor;

    private final AllBooksSubject allBooksSubject;


    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        CommandGetAllBooks cmd = new CommandGetAllBooks();
        syncExecutor.executeCommand(cmd, context);
        return new ResponseEntity<>(cmd.getResults(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {
        CommandGetBookById cmd = new CommandGetBookById(id);
        syncExecutor.executeCommand(cmd, context);
        return new ResponseEntity<>(cmd.getResultBook(), HttpStatus.OK);
    }

    @PostMapping
    public String addBook(@RequestBody Map<String, Object> request) {
        CommandAddBook cmd = new CommandAddBook(request);
        asyncExecutor.executeCommand(cmd, context);

        Book book = cmd.getResults();
        allBooksSubject.notifyObservers(book);
        return "Book saved [" + book.getId() + "] ";
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        CommandUpdateBook cmd = new CommandUpdateBook(id, updatedBook);
        asyncExecutor.executeCommand(cmd, context);
        return new ResponseEntity<>(cmd.getResults(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        CommandDeleteBook cmd = new CommandDeleteBook(id);
        asyncExecutor.executeCommand(cmd, context);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}