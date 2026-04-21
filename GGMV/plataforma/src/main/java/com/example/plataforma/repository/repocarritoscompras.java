package com.example.plataforma.repository;

import java.util.ArrayList;
import java.util.List;


import com.example.plataforma.MODEL.carritoscompras;

public class repocarritoscompras {
     List<carritoscompras> listac = new ArrayList<>();


    public void añadirlista(carritoscompras cp){
        listac.add(cp);
    } 
    public List<carritoscompras>mostrardb(){
        return listac ;
    }
} 


