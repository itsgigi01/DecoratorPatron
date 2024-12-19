/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator;



//GIL, MARIA DE LOS ANGELES 
public class Decorator {

    public static void main(String[] args) {
        
        
        System.out.println("Cafe 1: ");
        Cafe cafe1 = new Canela (new Leche(new Chocolate(new CafeSimple())));
        System.out.println( cafe1.descripcion()+", costo: $"+ cafe1.costo());
        
        System.out.println("Cafe 2: ");
        Cafe cafe2 = new Canela (new Chocolate(new CafeSimple()));
        System.out.println( cafe2.descripcion()+", costo: $"+ cafe2.costo());
    
        System.out.println("Cafe 3: ");
        Cafe cafe3 = new CafeSimple();
        System.out.println(cafe3.descripcion()+", costo: $"+ cafe3.costo());
        
        
    } 
        
        
    }

