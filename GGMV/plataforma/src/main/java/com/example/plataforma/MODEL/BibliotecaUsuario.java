package com.example.plataforma.MODEL;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "biblioteca_usuario")
@Data
public class BibliotecaUsuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Long juegoId;
    private LocalDate fechaAdquisicion;
    private Double horasJugadas;

}
