package com.etitc.smart_network_managment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "regiones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    // Una region que sea el padre
    @ManyToOne
    @JoinColumn(name = "padre_id")
    private Region padre;

    // Lista de subregiones que dependen del padre
    @OneToMany(mappedBy = "padre", fetch = FetchType.EAGER)
    private List<Region> hijos;
}
