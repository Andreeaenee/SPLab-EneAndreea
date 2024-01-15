package com.example.spproject.services;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SyncExecutor implements CommandProcessor{
    public void executeCommand(Command command, CommandContext context) {
        try {
            command.execute(context);
        }
        catch(Exception e) {
            log.error("A aparut o exceptie in timpul executiei" + command, e);
        }
    }
}