/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;
import java.util.Scanner;

/**
 *
 * @author hnleo
 */
public class Lopez_Leonardo_Estructura {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int opSeleccion = 0, contadorPalabra= 0, contadorMax=0;
        int contadorPalabraReves=0;
        char letraReves = ' ';
        String palabraMax = "", palabraReves="", palabraRevesMax="";

        do{
            System.out.println("=======**  MENU PRINCIPAL  **=======\n");
            System.out.println("1. Palabra Alreves");
            System.out.println("1. Numero Perfecto");
            System.out.println("1. Primos");
            System.out.println("1. Votaciones");
            System.out.println("1. Salir");
            System.out.print("Seleccione una opción: ");
            opSeleccion = leer.nextInt();
            
            switch(opSeleccion){
            case 1: 
            System.out.println("\n======================================");
                contadorPalabraReves++;
                System.out.print("\nIngrese una cantidad deseada de palabras: ");
                int cantidadPalabras = leer.nextInt();
                
                for(int i = 1; i<=cantidadPalabras; i++ ){
                    palabraReves="";
                    System.out.println("\n");
                    System.out.print("Palabra #"+i+": ");
                    String palabra = leer.next().toLowerCase();
                    System.out.print("Al réves: ");
                    
                    for(int j = palabra.length() - 1;j>=0; j--){
                        letraReves = palabra.charAt(j);
                        System.out.print(letraReves);
                        palabraReves+=palabra.charAt(j);
                    }
                    
                    contadorPalabra = letraReves;
                    if(contadorPalabra>contadorMax){
                        contadorMax = contadorPalabra;
                        palabraMax = palabra;
                        palabraRevesMax=palabraReves;
                    }
                    
                    if(palabra.equals(palabraReves)){
                        System.out.println("\nEs palíndromo");
                               
                    }
                    
                  
                }
                System.out.println("\nLa palabra más larga es: "+palabraMax);
                  System.out.println("\n======================================\n");
                  
                  break;
        }
            
        }
        while(opSeleccion != 5 && opSeleccion <=4);
    }
    
}
