package com.tp;

public abstract class TipoCerveza extends Cerveza{
    private boolean gluten;
    Receta r;
    private int porcentajeComplejidad;

    public TipoCerveza(int id, String nombre, float ABL, String descripcion, boolean gluten, int porcentajeComplejidad){
        super(id,nombre,ABL,descripcion);
        this.gluten=gluten;
        this.porcentajeComplejidad=porcentajeComplejidad;

    }

    public void setR(Receta r) {
        this.r = r;
    }

    public abstract void calcularCostoFabricacion();
    public abstract String toString();
}
