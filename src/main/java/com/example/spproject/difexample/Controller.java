package com.example.spproject.difexample;
import com.example.spproject.difexample.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private final ClientComponent clientComponent;

    @Autowired
    public Controller(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello from ClientComponent = " + clientComponent.toString();
    }
}