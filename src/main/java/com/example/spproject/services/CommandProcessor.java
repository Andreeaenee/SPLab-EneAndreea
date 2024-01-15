package com.example.spproject.services;

public interface CommandProcessor {

    void executeCommand(Command command, CommandContext context);
}