/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author carolay
 */
public class Alumno {
     //atributos
    int numCuenta;
    int anioEscolar;
    int numSemestre;
    String nombre;
    String carrera;
  
    //metodo constructor
    public Alumno (){
        
        
    }
   
    public Alumno(int numCuenta, int anioEscolar, int numSemestre, String nombre, String carrera){
        this.numCuenta= numCuenta ;
        this.numSemestre= numSemestre;
        this.anioEscolar= anioEscolar ;
        this.nombre= nombre;
        this.carrera= carrera;
    }
     //metodo de accion
    public void leer (){
        System.out.println("Alumno lee");
    }
    public void hacerTareas (){
        System.out.println("Tareas echas: ");
    }
    public void hacerExamenes (){
        System.out.println("El examen echo es: ");
    }
    public void estudiar (){
        System.out.println("Alumno estudia ");
    }
    
    public void imprimirAlumno(){
        System.out.println("Numero de Cuenta "+numCuenta);
        System.out.println("Anio escolar"+anioEscolar);
        System.out.println("Semestre Escolar"+numSemestre);
        System.out.println("Nombre "+nombre);
        System.out.println("Carrera"+carrera);
        
    }
}
