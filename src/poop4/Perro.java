/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author carolay
 */
public class Perro {
     //atributos
    int numOrejas;
    int numPatas;
    String nombre;
    String color;
    String raza;
  
    //metodo constructor
    public Perro (){
        
        
    }
   
    public Perro(int numOrejas, int numPatas, String nombre, String color, String raza){
        this.numOrejas= numOrejas;
        this.numPatas= numPatas;
        this.nombre= nombre;
        this.color= color;
        this.raza= raza;
    }
     //metodo de accion
    public void jugar (){
        System.out.println("Perro juega ");
    }
    public void correr (){
        System.out.println("Perro corre ");
    }
    public void ladrar (){
        System.out.println("Perro ladra ");
    }
    public void comer (){
        System.out.println("Perro come ");
    }
    public void dormir (){
        System.out.println("Perro duerme ");
    }
    public void imprimirPerro(){
        System.out.println("Numero de orejas "+numOrejas);
        System.out.println("Numero de patas "+numPatas);
        System.out.println("Nombre "+nombre);
        System.out.println("Color"+color);
        System.out.println("Raza"+raza);
    }
    
}
