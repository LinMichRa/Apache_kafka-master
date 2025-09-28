package co.vinni.kafka.SBConsumidor.listener;

import co.vinni.kafka.SBConsumidor.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderListener.class);
    private final List<Order> processedOrders = new ArrayList<>();

    @KafkaListener(topics = "orders-topic", groupId = "ecommerce-group")
    public void listen(Order order) {
        LOGGER.info("📦 Orden recibida: {}", order.getId());
        processedOrders.add(order);
    }

    public List<Order> getProcessedOrders() {
        return processedOrders;
    }
}
