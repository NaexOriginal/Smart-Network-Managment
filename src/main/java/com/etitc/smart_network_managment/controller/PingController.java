package com.etitc.smart_network_managment.controller;

import com.etitc.smart_network_managment.dto.InfoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Marcar esta clase como un controlador
@RestController
@RequestMapping("/api")
public class PingController {
    // Verificar la información
    @GetMapping("/ping")
    public String ping() {
        return "Servidor funcionando";
    }

    // Devolver la información del aplicativo
    @GetMapping("/info")
    public InfoResponse info() {
        return new InfoResponse("Smart-Network Manager", "1.0");
    }

    // Rectificamos que un usuario puede entrar al servidor
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola " + nombre + "! Bienvenido a la red";
    }
}
