package co.vinni.kafka.SBConsumidor.controller;

import co.vinni.kafka.SBConsumidor.listener.OrderListener;
import co.vinni.kafka.SBConsumidor.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderQueryController {

    private final OrderListener orderListener;

    public OrderQueryController(OrderListener orderListener) {
        this.orderListener = orderListener;
    }

    @GetMapping("/processed")
    public List<Order> getProcessedOrders() {
        return orderListener.getProcessedOrders();
    }
}

