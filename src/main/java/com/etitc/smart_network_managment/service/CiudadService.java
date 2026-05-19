package com.etitc.smart_network_managment.service;

import com.etitc.smart_network_managment.dto.CiudadDTO;
import com.etitc.smart_network_managment.model.Ciudad;
import com.etitc.smart_network_managment.repository.CiudadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CiudadService {
    private final CiudadRepository ciudadRepository;

    // Devolvemos todas las ciudades guardadas
    public List<Ciudad> obtenerTodas() {
        return ciudadRepository.findAll();
    }

    // Buscar una ciudad por su ID
    public Ciudad obtenerPorId(Long id) {
        return ciudadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("La ciudad no se encuentra con ese ID"));
    }

    // Creacion de una nueva ciudad
    public Ciudad crear(CiudadDTO dto) {
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre(dto.getNombre());
        ciudad.setPais(dto.getPais());
        ciudad.setPoblacion(dto.getPoblacion());

        return ciudadRepository.save(ciudad);
    }

    // Eliminar una ciudad por ID
    public void eliminar(Long id) {
        ciudadRepository.deleteById(id);
    }
}
