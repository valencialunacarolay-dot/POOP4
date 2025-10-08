/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author poo02alu02
 */
public class Profesor {
    //atributos
    String nombre;
    String carrera;
    String materiaImparte;
    String divisionQuePertenece;
    int tiempoEjerciendo;
   
    //metodo constructor
    public Profesor (){
        
        
    }
   
    public Profesor(String nombre, String carrera, String materiaImparte, String divisionQuePertenece, int tiempoEjerciendo){
        this.nombre= nombre;
        this.carrera= carrera;
        this.materiaImparte = materiaImparte;
        this.divisionQuePertenece = divisionQuePertenece;
        this.tiempoEjerciendo = tiempoEjerciendo;
    }
    
     //metodo de accion
    public void pasarLista (){
        System.out.println("La lista es: ");
    }
    public void calificarTareas (){
        System.out.println("Tareas calificadas: ");
    }
    public void hacerExamen (){
        System.out.println("El examen es: ");
    }
    public void universidad (){
        System.out.println("Es de la universidad de: ");
    }
    public void imprimirProfesor(){
        System.out.println("nombre "+nombre);
        System.out.println("Carrera "+carrera);
        System.out.println("Materia "+materiaImparte);
        System.out.println("Division "+divisionQuePertenece);
        System.out.println("Tiempo ejerciendo"+tiempoEjerciendo);
            
    }
}
