package com.example.spproject.services;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.spproject.persistence.AuthorRepository;
import com.example.spproject.persistence.BooksRepository;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)

public class CommandContext {

    @Getter
    final private BooksRepository bookRepository;

    @Getter
    final private AuthorRepository authorRepository;
}