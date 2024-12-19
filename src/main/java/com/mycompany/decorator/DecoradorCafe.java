/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;



//GIL, MARIA DE LOS ANGELES 
public class DecoradorCafe implements Cafe{
    
    private Cafe cafeDecorado; 

    public DecoradorCafe(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }
    
    @Override 
    
    public String descripcion(){
        return cafeDecorado.descripcion();
    } 
    
    @Override 
    public double costo(){
        
        return cafeDecorado.costo();
    }

    public Cafe getCafeDecorado() {
        return cafeDecorado;
    }

    public void setCafeDecorado(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }
   
    
}
