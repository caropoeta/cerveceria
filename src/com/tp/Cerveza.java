package com.tp;

public abstract class Cerveza {
    private int id;
    private String nombre;
    private double precio;
    private float ABL;
    private String descripcion;

    public Cerveza (int id, String nombre, float ABL, String descripcion){
        this.id=id;
        this.nombre=nombre;
        this.ABL=ABL;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract void calcularCostoFabricacion();
    public abstract String toString();

}
