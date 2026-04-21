package com.example.plataforma.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.plataforma.MODEL.BibliotecaUsuario;


public class repobiblioteca {

     List<BibliotecaUsuario> listasd = new ArrayList<>();


    public void añadirlista(BibliotecaUsuario sd){
        listasd.add(sd);
    } 
    public List<BibliotecaUsuario>mostrardb(){
        return listasd;
    }
} 


