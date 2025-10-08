/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author poo02alu02
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("################ Punto ################");
        Punto punto1 = new Punto ();
        punto1.imprimirPunto ();
        punto1.x = 4;
        punto1.y = 7;
        punto1.imprimirPunto();
        
        Punto punto2 = new Punto(10,88);
        punto2.imprimirPunto();
        
        System.out.println("Punto2 x="+punto2.x);
        
        System.out.println("############### Carro ################");
        Carro carro1 = new Carro();
        carro1.imprimirCarro();
        carro1.marca = "Tesla";
        carro1.modelo = "Model Y";
        carro1.color = "Negro";
        carro1.numPuertas = 4;
        carro1.numLlantas= 4;
        carro1.imprimirCarro();
        
        
       Carro carro2 = new Carro("BMW", 4, "Morado", 4, "Z4 M40i");
       carro2.imprimirCarro();
       
        System.out.println("################# Profesor #################");
       
       Profesor profesor1= new Profesor();
       profesor1.imprimirProfesor();
       profesor1.nombre = " Maria ";
       profesor1.carrera = "Geofisica";
       profesor1.materiaImparte= "Geologia Estrcutural";
       profesor1.divisionQuePertenece = "DICT";
       profesor1.tiempoEjerciendo = 10;
       profesor1.imprimirProfesor();
       
       System.out.println("################ Perro ###############");
       
       Perro perro1 = new Perro();
       perro1.imprimirPerro();
       
       perro1.numOrejas = 2;
       perro1.numPatas = 4;
       perro1.nombre = " Kokoa ";
       perro1.raza = " Mestizo ";
       perro1.color = " Negro con amarillo ";
       perro1.imprimirPerro();
       
       System.out.println("############### Triangulo Rectangulo #############");
       
       TrianguloRectangulo trianguloRectangulo1 = new TrianguloRectangulo ();
       trianguloRectangulo1.imprimirTrianguloRectangulo();
       
       trianguloRectangulo1.anguloEntreCayCo = 90 ;
       trianguloRectangulo1.anguloEntreCayH = 45 ;
       trianguloRectangulo1.anguloEntreCoyH = 45 ;
       trianguloRectangulo1.color = "amarillo" ;
       trianguloRectangulo1.tipo = "Isoceles" ;
       trianguloRectangulo1.imprimirTrianguloRectangulo();
       
        System.out.println("################# Alumno ################");
        
        Alumno alumno1= new Alumno();
        alumno1.imprimirAlumno();
        alumno1.nombre= "Carolay Luna";
        alumno1.carrera= "Geofisica";
        alumno1.anioEscolar= 3;
        alumno1.numSemestre= 6;
        alumno1.numCuenta =  426121123;
        alumno1.imprimirAlumno();
      
    }
    
}
