/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author carolay
 */
public class TrianguloRectangulo {
    //Ca=cateto adyancente
    //Co=cateto opuesto
    //H=hipotenusa
    
    //Metodo de atributos
    float anguloEntreCayCo;
    float anguloEntreCayH;
    float anguloEntreCoyH;
    String tipo;
    String color;
    
    // Metodo constructor
    public TrianguloRectangulo(){
        
    }
     public TrianguloRectangulo(float anguloEntreCayCo, float anguloEntreCayH,float anguloEntreCoyH, String tipo, String color){
         
         this.anguloEntreCayCo= anguloEntreCayCo;
         this.anguloEntreCayH= anguloEntreCayH;
         this.anguloEntreCoyH= anguloEntreCoyH;
         this.tipo= tipo;
         this.color= color;
         
     }
     public void funcionSeno(){
         System.out.println("cociente entre la longitud del cateto opuesto al ángulo y la longitud de la hipotenusa es: ");
     }
     
     public void funcionCoseno(){
         System.out.println("cociente entre la longitud del cateto adyance al ángulo y la longitud de la hipotenusa es: ");
     }
     
     public void funcionTangente(){
         System.out.println(" cociente entre el cateto opuesto al ángulo y el cateto adyacente a ese mismo ángulo es: ");
     }
     
     public void teoremaPitagoras(){
         System.out.println(" La raiz de la suma de los catetos al  cuadrado es : ");
     }
     public void sumaDeAngulosInternos (){
         System.out.println("suman los angulos internos es: ");
        
     }
     public void imprimirTrianguloRectangulo(){
         System.out.println("anguloEntreCayCo"+anguloEntreCayCo);
         System.out.println("anguloEntreCayH"+anguloEntreCayH);
         System.out.println("anguloEntreCoyH"+anguloEntreCoyH);
         System.out.println("tipo"+tipo);
         System.out.println("color"+color);
     }
    
    
}
