package com.tp;

import java.util.ArrayList;
import java.util.Iterator;

public class Fabrica {
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Cerveza> list_cervezas;

    public Fabrica(int id, String nombre, String direccion){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
        this.list_cervezas= new ArrayList();
    }

    public void agregarCerveza(Cerveza cerveza){
        this.list_cervezas.add(cerveza);
    }

    public void quitarCerveza(Cerveza cerveza){
        this.list_cervezas.remove(cerveza);
    }

    public void listarCerveza() {
        Iterator var1 = this.list_cervezas.iterator();

        while(var1.hasNext()) {
            Cerveza c = (Cerveza) var1.next();
            System.out.println(c.toString());
        }

    }
    public String toString(){
        return "Fabrica: " + nombre + ", ID: " + id + ", Direccion: " + direccion ;
    }

}
