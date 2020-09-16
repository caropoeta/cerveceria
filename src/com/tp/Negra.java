package com.tp;

import java.util.Iterator;

public class Negra extends TipoCerveza{

    public Negra (int id, String nombre, float ABL, String descripcion, boolean gluten, int porcentajeComplejidad){
        super(id,nombre,ABL,descripcion,gluten,porcentajeComplejidad);

    }

    @Override
    public void calcularCostoFabricacion() {
        double total = 0;

        Ingrediente ingrediente;
        for(Iterator var2 = this.r.getList_ingr().iterator(); var2.hasNext(); total += ingrediente.getPrecioUnidad()) {
            ingrediente = (Ingrediente)var2.next();
        }
        this.setPrecio(total*1.20);

    }

    public String toString(){
        return "Cerveza:" + this.getNombre() + ", tipo negra. Descripcion: " + this.getDescripcion() + " Precio: " + getPrecio() ;
    }
}
