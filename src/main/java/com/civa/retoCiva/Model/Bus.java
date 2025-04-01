package com.civa.retoCiva.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_de_bus",nullable = false)
    private String numBus;

    @Column(name = "numero_de_placa",nullable = false, unique = true)
    private String numPlac;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion",nullable = false, updatable = false)
    private Date fechCre;

    @Column(name = "caracteristicas")
    private String caracters;

    @ManyToOne
    @JoinColumn(name = "id_marca_bus", nullable = false)
    private MarcaBus idMarcaBus;

    @Column(name = "activo",nullable = false)
    private boolean isActive;
}