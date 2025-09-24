package co.vinni.kafka.SBProveedor;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ChatController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String user, @RequestParam String message) {
        String fullMessage = user + ": " + message;
        kafkaTemplate.send("EquipoKafka-topic", fullMessage);
        return "Mensaje enviado: " + fullMessage;
    }
}

