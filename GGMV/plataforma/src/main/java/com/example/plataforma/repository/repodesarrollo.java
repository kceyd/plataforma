package com.example.plataforma.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.plataforma.MODEL.Desarrollador;


public class repodesarrollo {

    List<Desarrollador> lista = new ArrayList<>();


    public void añadirlista(Desarrollador FD){
        lista.add(FD);
    } 
    public List<Desarrollador>mostrardb(){
        return lista;
    }
} 


