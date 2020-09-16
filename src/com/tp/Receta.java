package com.tp;

import java.util.ArrayList;
import java.util.Iterator;

public class Receta {
    private int id;
    private String nombre;
    private String pais;
    private ArrayList<Ingrediente> list_ingr;


    public Receta(int id, String nombre, String pais){
        this.nombre=nombre;
        this.id=id;
        this.pais=pais;
        this.list_ingr= new ArrayList();
    }

    public void agregarIngrediente(Ingrediente i){
        this.list_ingr.add(i);
    }

    public void quitarIngrediente(Ingrediente i){
        this.list_ingr.remove(i);
    }

    public ArrayList<Ingrediente> getList_ingr() {
        return list_ingr;
    }

    public String toString(){
        return "<Receta: " + nombre + ", ID: "+ id + ", Pais:" + pais + ">";
    }

}
