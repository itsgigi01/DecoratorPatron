/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;



//GIL, MARIA DE LOS ANGELES 
public class Leche extends DecoradorCafe{
    

    public Leche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }
    
    @Override
    public String descripcion(){
        return super.descripcion()+ ", con Leche";
    }
    
    
    @Override
    public double costo(){
        return super.costo() + 0.5;
    }
    
    
}
    

    
    

