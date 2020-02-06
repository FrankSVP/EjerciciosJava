/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author FrankS
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        
        Scanner myObj = new Scanner(System.in);
        Recursividad objeto = new Recursividad();
      System.out.print("Ingrese el número correspondiente para");
      String numero = myObj.nextLine();
     resultado= objeto.factorial(Integer.parseInt(numero)) ;
        
      System.err.println("El factorial es: "+ String.valueOf(resultado) );
     
    }
    
    
    public int factorial(int n){
            
     {
      if(n==0) return 1; 
      
      else 
          
      return n*factorial(n-1);
    }
    }
}
