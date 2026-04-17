package com.example.plataforma.MODEL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "RANKING")
@Data

public class RANKING {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nombreJugador;
    private int puntos;
    private int nivel;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;
    private double porcentajeVictorias;
    private int posicion;
}
