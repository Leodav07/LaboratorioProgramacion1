/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;
import java.util.Scanner;
/**
 *
 * @author hnleo
 */
public class Lopez_Leonardo_TIEMPO {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    leer.useDelimiter("\n");
    System.out.println("CONVERTIDOR DE TIEMPO");
    System.out.print("Ingrese cantidad de segundos: ");
    int segundosIngresados = leer.nextInt();
    
    String formatoTiempo = (segundosIngresados > 0) ? "Es: "+segundosIngresados/3600+" horas - "+
            (segundosIngresados % 3600)/60 + " minutos - "+ segundosIngresados % 60+ " segundos": "No se permite ese valor";
    
    System.out.println(formatoTiempo);
    }
    
}
