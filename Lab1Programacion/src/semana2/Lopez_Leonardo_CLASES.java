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
public class Lopez_Leonardo_CLASES {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        int posicionComa, dia, mes;
        String posicionDiaText, posicionFechaNumerica, decisionSiNo, dec;
        double promAlumnos, porcentajeAprobados;

        System.out.println("*** ENGLISH INSTITUTION ***");
        System.out.print("Ingrese la fecha actual 'día, DD/MM': ");
        String fechaentrada = leer.nextLine().trim();

        posicionComa = fechaentrada.indexOf(',');

        if (posicionComa == -1) {
            System.out.println("Se produjo un error");
        }

        posicionDiaText = fechaentrada.substring(0, posicionComa).trim().toLowerCase();
        posicionFechaNumerica = fechaentrada.substring(posicionComa + 1).trim();

        String diaST = posicionFechaNumerica.substring(0, 2);
        String mesST = posicionFechaNumerica.substring(3, 5);

        dia = Integer.parseInt(diaST);
        mes = Integer.parseInt(mesST);

        if (dia < 31 && mes <= 12) {
            if (posicionDiaText.equals("lunes") || posicionDiaText.equals("martes") || posicionDiaText.equals("miercoles")) {
                System.out.println("Dia: " + posicionDiaText);
                System.out.print("¿Hubo exámenes?: ");
                decisionSiNo = leer.nextLine();

                dec = decisionSiNo.toLowerCase();
                if (dec.equals("si")) {
                    System.out.print("¿Cuantos alumnos aprobaron?: ");
                    int aprobAlumnos = leer.nextInt();
                    System.out.print("¿Cuantos alumnos reprobaron?: ");
                    int reproAlumnos = leer.nextInt();

                    promAlumnos = aprobAlumnos + reproAlumnos;
                    porcentajeAprobados = (aprobAlumnos / promAlumnos) * 100;
                    String porcentajeAprobadosU = String.format("%.2f", porcentajeAprobados);
                    System.out.println("Porcentaje de alumnos aprobados es de: " + porcentajeAprobadosU + "%");
                }
            } else if (posicionDiaText.equals("jueves")) {
                System.out.println("Dia: " + posicionDiaText);
                System.out.print("Ingresar el porcentaje de asistencia: ");
                int porcentajeAsistencia = leer.nextInt();

                String mensajeAsistencia = (porcentajeAsistencia >= 50) ? "Asistió la mayoría" : "No asistió la mayoría";
                System.out.println(mensajeAsistencia);

            }
            else if (posicionDiaText.equals("viernes") && dia == 01){
                if(mes == 01 || mes == 07){
                   System.out.println("Dia: " + posicionDiaText);
                   System.out.println("Comienzo de nuevo ciclo");
                   System.out.print("Ingrese cantidad de nuevos alumnos: ");
                   int cantidadAlumnos = leer.nextInt();
                   System.out.print("Ingrese precio por cada alumno en $: ");
                   int precioAlumnos = leer.nextInt();
                   
                   double precioTotal = cantidadAlumnos * precioAlumnos;
                   
                   System.out.print("Ingreso total: "+precioTotal+"$\n");
                }
                else{
                    System.out.println("Fecha no válida..");
                }
            }
        } else {
            System.out.println("Se produjo un error");
        }

    }

}
