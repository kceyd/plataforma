package com.example.plataforma.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.plataforma.MODEL.notificaciones;

public class repornotificacciones {

     List<notificaciones> lista = new ArrayList<>();


    public void añadirlista(notificaciones ws){
        lista.add(ws);
    } 
    public List<notificaciones>mostrardb(){
        return lista;
    }
} 


