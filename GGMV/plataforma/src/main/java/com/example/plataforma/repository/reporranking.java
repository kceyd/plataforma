package com.example.plataforma.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.plataforma.MODEL.RANKING;


public class reporranking {


     List<RANKING> lista = new ArrayList<>();


    public void añadirlista(RANKING ws){
        lista.add(ws);
    } 
    public List<RANKING>mostrardb(){
        return lista;
    }
} 

