package com.etitc.smart_network_managment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegionDTO {
    private Long id;
    private String nombre;

    // Cadaa uno de los hijos de la region
    private List<RegionDTO> hijos;
}
