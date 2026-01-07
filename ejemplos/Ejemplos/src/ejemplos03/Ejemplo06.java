/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos03;

/**
 *
 * @author Usuario iTC
 */
public class Ejemplo06 {
       static int suma = 0; // variable de alcance  global
                        // se la puede usar e cualquier método
                        // hemos declarado la variable statica
                        // porque estamos usando método staticos
                           
    public static void main(String[] args) {
        // 
        System.out.printf("Valor de variable suma (main): %d\n", suma); // 0
        obtenerSuma(10, 30); // .
        obtenerSumaDos(); // .
       
        // System.out.printf("Valor de variable suma (main): %d\n", suma); 
        
    }
        
    public static void obtenerSuma(int a, int b){
        
        suma = a + b; // 10 + 30 // 40
                      // 10 + 30 // 40
        System.out.printf("Valor de variable suma (obtenerSuma): %d\n", suma); // 40
                                                                               // 40 
        
    }
    
    public static void obtenerSumaDos(){
        
        suma = suma + 100; // 40 + 100 // 140
                           // 140 + 100 // 240
        System.out.printf("Valor de variable suma (obtenerSumaDos): %d\n", suma); // 140
                                                                                  // 240      
                                                                                  
        
    }
    
    
}
