/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author hnleo
 */
public class Lopez_Leonardo_Exam1 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int opSeleccion=0;
    do{
        System.out.println("** MENU PRINCIPAL **");
        System.out.println("  1. PIRAMIDE");
        System.out.println("  2. CLAVE");
        System.out.println("  3. PIEDRA, PAPEL Y TIJERA");
        System.out.println("  4. ADIVINAR");
        System.out.println("=======================\n");
        System.out.println("Seleccione una opcion: ");
        opSeleccion = leer.nextInt();
        
        switch(opSeleccion){
            case 1: 
                break;
                
            case 2: 
                
                break;
                
            case 3:
                
                break;
                
            case 4: 
                
                break;
                
            case 5: 
                
                break;
                
            default:
                System.out.println("\nSelecciona una opcion valida.\n");
        }
        
    }while(opSeleccion!=5);
            
            }
}
