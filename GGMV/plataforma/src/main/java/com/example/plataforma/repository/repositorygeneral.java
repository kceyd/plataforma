package com.example.plataforma.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.plataforma.MODEL.Usuario;

public class repositorygeneral {

     List<Usuario> lista = new ArrayList<>();


    public void añadirlista(Usuario ws){
        lista.add(ws);
    } 
    public List<Usuario>mostrardb(){
        return lista;
    }
} 