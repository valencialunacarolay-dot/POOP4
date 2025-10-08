/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo02alu02
 */
   public class Punto {
    int x;
    int y;
    // Metdos
    
    //Metodo constructor
    public Punto (){
        //x=0;
        //y=0;
    }
    Punto (int x, int y){
        this.x=x;
        this.y=y;
        
    }
    //Metodo de accion 
    void imprimirPunto(){
        System.out.println("("+x+","+y+")");
    }
}

