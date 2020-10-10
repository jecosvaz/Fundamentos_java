
package retos_uno;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.BorderUIResource;

public class Retos_uno {

   
    public static void main(String[] args) {
       
     
    /*
     Primer reto:   
     Genera un codigo en donde al finalizar 
     la consola nos muestre o imprima, si la persona
     es mayor de edad o menor de edad.
    */        
    /*
     Scanner sc = new Scanner (System.in);
        
      System.out.println("¿Cúal es tu edad?");
       int edad = sc.nextInt();
                      
        if(edad>=18){
                System.out.println("Eres mayor de edad");
           
        }else{ 
         System.out.println("No eres mayor de edad");
        }
    */   
    /*
      Segundo reto:
      Escribe un codigo en donde al finalizar 
      la consola nos muestre o imprima, si el 
      numero es positivo, negativo o cero.
    */
    /* 
      Scanner sc = new Scanner (System.in);
      
        System.out.println("Escribe tu numero");
        
        int validatorNumber = sc.nextInt();
        
          if(validatorNumber==0){
              System.out.println("Tu numero es cero");
          }else{
              if(validatorNumber>0){
            
                System.out.println("Tu numero es positivo");
              }else{
            
                System.out.println("Tu numero es negativo");
            }
          }
    */
     
    /*
     Tercer reto:
     3. Escribe un codigo en donde al finalizar la consola 
     nos muestre o imprima, si el numero escrito es primo y 
     en caso de ser primo nos regrese un true o false en caso de no serlo.
     */
     
    /* Scanner sc = new Scanner (System.in);
     boolean resultado;
     
     System.out.println("Escribe el numero");
     int Number = sc.nextInt();
     
       int iterador = 2;
       boolean primo=true;

       while ((primo) && (iterador!=Number)){
           System.out.println(iterador); 
           if (Number % iterador == 0)
              
               primo = false;
      iterador++;
           System.out.println(primo);
      }*/
    
    
    /*
      5. Escribe un codigo que mediante ventanas emergentes 
      agreguemos 3 numeros que hagan las siguientes 
      operaciones: Sumar, Restar, Multiplicar y elevar al cuadrado 
      la suma la resta y la multiplicacion de estos.    
    */
    /*
        double numberA, numberB, numberC;

        numberA=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
        numberB=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        numberC=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el tercer numero"));

            //Declaramos variables de operacion
            double suma = numberA + numberB + numberC;
            double resta = numberA - numberB - numberC;
            double multiplicacion = (numberA * numberB * numberC);
            //Elevamos variables de operación 
            double resultadoSuma= Math.pow(suma, 2);
            double resultadoResta= Math.pow(resta, 2);
            double resultadoMultiplicacion= Math.pow(multiplicacion, 2);
        //imprimimos los resultados
        System.out.println("El resultado de la suma es: "+suma+"\nEl resultado de la resta es: "
           +resta+"\nEl resultado de la multiplicación es: "+multiplicacion+"\nLos resultados elevados al cuadrado son: "
           +"\n"+resultadoSuma+"\n"+resultadoResta+"\n"+resultadoMultiplicacion);    
    
           
    */       
    JOptionPane.showMessageDialog(null,"hola");
    }//fin clase main
    
}
