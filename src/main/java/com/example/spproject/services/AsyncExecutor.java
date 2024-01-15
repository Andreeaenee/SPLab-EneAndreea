package com.example.spproject.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Slf4j
public class AsyncExecutor implements CommandProcessor {
    private static final int THREADS_COUNT = 8;

    private ExecutorService executor = Executors.newFixedThreadPool(THREADS_COUNT);

    public void executeCommand(Command command, CommandContext context) {
        try {
            executor.submit(() -> {
                command.execute(context);
            });
        }
        catch(Exception e) {
            log.error("A aparut o exceptie in timpul executiei" + command, e);
        }
    }
}