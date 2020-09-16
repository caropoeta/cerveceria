package com.tp;

public class Ingrediente {
    private int id;
    private String nombre;
    private String descripcion;
    private float cantidad;
    private float precioUnidad;

    public Ingrediente(int id, String nombre, String descripcion, float cantidad, float precioUnidad){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnidad=precioUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public String toString(){
        return "<Ingrediente: "+ nombre + ", Precio: " + precioUnidad +">";
    }
}
