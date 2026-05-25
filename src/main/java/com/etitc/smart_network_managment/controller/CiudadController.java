package com.etitc.smart_network_managment.controller;

import com.etitc.smart_network_managment.dto.CiudadDTO;
import com.etitc.smart_network_managment.dto.RegionDTO;
import com.etitc.smart_network_managment.model.Ciudad;
import com.etitc.smart_network_managment.service.CiudadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciudades")
@RequiredArgsConstructor
public class CiudadController {
    private final CiudadService ciudadService;

    // Obtener todas las ciudades
    @GetMapping
    public List<Ciudad> obtenerTodas() {
        return ciudadService.obtenerTodas();
    }

    // Obtener una ciudad por ID
    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(ciudadService.obtenerPorId(id));
    }

    // Crear una nueva ciudad
    @PostMapping
    public ResponseEntity<Ciudad> crear(@RequestBody CiudadDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ciudadService.crear(dto));
    }

    // Nuevo Metodo - El vque nos devolvera toda la jerarquia de la region
    @GetMapping("/jerarquia/{regionId}")
    public ResponseEntity<RegionDTO> obtenerJerarquia(@PathVariable Long regionId) {
        return ResponseEntity.ok(ciudadService.obtenerJerarquia(regionId));
    }
}
