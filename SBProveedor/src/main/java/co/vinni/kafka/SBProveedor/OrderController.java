package co.vinni.kafka.SBProveedor;


import co.vinni.kafka.SBProveedor.model.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final KafkaTemplate<String, Order> kafkaTemplate;
    private static final String TOPIC = "orders-topic";

    public OrderController(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/create")
    public String createOrder(@RequestBody Order order) {
        order.setId(UUID.randomUUID().toString());
        kafkaTemplate.send(TOPIC, order);
        return "✅ Orden enviada: " + order.getId();
    }
}


