package co.vinni.kafka.SBProveedor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/chat")
public class ChatHistoryController {

    private final List<String> messages = new ArrayList<>();

    @KafkaListener(topics = {"EquipoKafka-topic"}, groupId = "my-group-id")
    public void listener(String message){
        messages.add(message);
    }

    @GetMapping("/messages")
    public List<String> getMessages(){
        return messages;
    }
}

