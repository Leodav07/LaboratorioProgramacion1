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
public class Lopez_Leonardo_FECHA {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        String fecha1, fecha2;
        int primerDia=0, segundoDia=0, primerMes=0, segundoMes=0, primerAnno=0, segundoAnno=0;
        int fechatotal1=0, fechatotal2=0, difDias = 0;
                
        System.out.println("** RANGO DE FECHAS **");
        System.out.print("Primera Fecha (Día/Mes/Año): ");
        fecha1 = leer.nextLine();
        System.out.print("Segunda Fecha (Día/Mes/Año): ");
        fecha2 = leer.nextLine();
        
        primerDia = Integer.parseInt(fecha1.substring(0, 2));
        primerMes = Integer.parseInt(fecha1.substring(3, 5));
        primerAnno = Integer.parseInt(fecha1.substring(6, 10));
        
        segundoDia = Integer.parseInt(fecha2.substring(0, 2));
        segundoMes = Integer.parseInt(fecha2.substring(3, 5));
        segundoAnno = Integer.parseInt(fecha2.substring(6, 10));
        
        fechatotal1 = primerAnno * 12 * 30 + (primerMes - 1)* 30 + primerDia;
        fechatotal2 = segundoAnno * 12 * 30 + (segundoMes - 1)* 30 + segundoDia;
        
        if(fechatotal1>fechatotal2){
            difDias  = fechatotal1-fechatotal2;
        }else{
            difDias = fechatotal2-fechatotal1;
        }
        
        System.out.println("La diferencia de días entre: "+fecha1+ " y "+ fecha2 +" es de: "+difDias+ " días");
    }
}
