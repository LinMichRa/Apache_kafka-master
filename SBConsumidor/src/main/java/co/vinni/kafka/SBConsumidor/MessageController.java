package co.vinni.kafka.SBConsumidor;


import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class MessageController {

    // lista en memoria para guardar mensajes recibidos
    private final List<String> messages = new ArrayList<>();

    // Endpoint para consultar mensajes
    @GetMapping("/messages")
    public List<String> getMessages() {
        return messages;
    }

    // Método para que el listener agregue mensajes a la lista
    public void addMessage(String msg) {
        messages.add(msg);
    }
}

