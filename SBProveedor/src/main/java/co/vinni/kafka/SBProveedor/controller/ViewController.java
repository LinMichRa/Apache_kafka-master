package co.vinni.kafka.SBProveedor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/ordenes")
    public String mostrarFormulario() {
        return "orderForm";
    }

    @GetMapping("/ordenes/guardadas")
    public String verOrdenesGuardadas() {
        return "orders-list";
    }
}

