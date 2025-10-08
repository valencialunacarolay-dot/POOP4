/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo02alu02
 */
public class Carro {
    //atributos
    String modelo;
    int numLlantas;
    String color;
    int numPuertas;
    String marca;
   // model Y
    //Metodo constructor
    public Carro() { 
    
    }
    public Carro(String marca, int numLlantas, String color, int numPuertas, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPuertas = numPuertas;
        this.numLlantas= numLlantas;
    }
    //Metodo de accion
    public void avanzar () {
        System.out.println("Coche avanza");
    }
    public void frenar () {
        System.out.println("Coche frenar");
    }
    public void cambiosDeVelocidad () {
        System.out.println("Coche hace cambios de velocidad");
    }
    public void retroceder () {
        System.out.println("Coche retrocede");
    }
    public void girar (){
        System.out.println("Coche gira");
    }
    
    public void imprimirCarro (){
        System.out.println("Marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("Numero de Puertas: "+numPuertas);
        System.out.println("Numero de llantas: "+numLlantas);
        System.out.println("Color: "+color);
    }        
}
