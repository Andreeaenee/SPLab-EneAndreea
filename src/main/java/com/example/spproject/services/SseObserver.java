package com.example.spproject.services;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import com.example.spproject.Entity.Book;

public class SseObserver implements Observer{

    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book) {
        try {
            emitter.send(book);
        } catch (Exception e) {
            emitter.completeWithError(e);
        }
    }
}