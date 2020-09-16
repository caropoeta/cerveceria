package com.tp;


public class Main {

    public static void main(String[] args) {


        Ingrediente i1= new Ingrediente(1,"trigo","trigo",200,50);
        Ingrediente i2= new Ingrediente(2,"lupulo","lupulo rojo",500,65);
        Ingrediente i3= new Ingrediente(3,"Miel", "Aromatizante",12,3);
        Ingrediente i4=new Ingrediente(4,"cebada","Grano",600,100);
        Ingrediente i5= new Ingrediente(5,"Vainilla","Aromatizante",3,20);
        Receta r1=new Receta(1,"Rubia Honey","Argentina");
        Receta r2= new Receta(2,"Roja Vainilla", "España");
        Receta r3= new Receta(3,"Negra Clasica","Alemania");
        r1.agregarIngrediente(i1);
        r1.agregarIngrediente(i2);
        r1.agregarIngrediente(i3);
        r2.agregarIngrediente(i1);
        r2.agregarIngrediente(i2);
        r2.agregarIngrediente(i5);
        r3.agregarIngrediente(i1);
        r3.agregarIngrediente(i2);
        r3.agregarIngrediente(i4);
        Roja roja= new Roja(10,"English Brown",3,"suave", true,15);
        roja.setR(r2);
        roja.calcularCostoFabricacion();
        Rubia rubia=new Rubia(11,"Honey",3,"Intensa",false,10);
        rubia.setR(r1);
        rubia.calcularCostoFabricacion();
        Negra negra=new Negra(12,"Cream stout",6,"Cremosa",true,20);
        negra.setR(r3);
        negra.calcularCostoFabricacion();

        Fabrica mifabrica= new Fabrica(123,"Antares","Olavarria 2222");
        System.out.println(mifabrica);
        mifabrica.agregarCerveza(rubia);
        mifabrica.agregarCerveza(roja);
        mifabrica.agregarCerveza(negra);
        mifabrica.listarCerveza();


    }
}
