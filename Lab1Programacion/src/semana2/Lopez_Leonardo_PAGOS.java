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
public class Lopez_Leonardo_PAGOS {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        int horasN = 0, horasEx = 0, horasTrabajadas = 0;
        double pxhn = 0, pxhe = 0, pagoTotal = 0;

        System.out.println("** SISTEMA DE PAGOS **");
        System.out.print("Ingresar codigo de empleado: ");
        String codigoEmpleado = leer.nextLine();
        System.out.print("Ingresar nombre de empleado: ");
        String nombreEmpleado = leer.nextLine();
        System.out.print("Ingresar apellido de empleado: ");
        String apellidoEmpleado = leer.nextLine();
        String nombreCompleto = nombreEmpleado + " " + apellidoEmpleado;
        System.out.print("Ingresar cantidad de horas: ");
        horasTrabajadas = leer.nextInt();
        System.out.println("Ingrese Categoría del Trabajador");
        System.out.println("Categoría 1 - $40 por hora extra");
        System.out.println("Categoría 2 - $50 por hora extra");
        System.out.println("Categoría 3 - $85 por hora extra");
        System.out.println("Categoría 4 - $0 por hora extra");
        System.out.print("Categoría: ");
        int categoria = leer.nextInt();

        switch (categoria) {
            case 1:
                if (horasTrabajadas <= 40) {
                    horasN = horasTrabajadas;
                    horasEx = 0;
                } else {
                    horasEx = horasTrabajadas - 40;
                    horasN = 40;
                    if (horasEx > 15) {
                        horasEx = 15;
                    }
                }
                pxhn = horasN * 35.99;
                pxhe = horasEx * 40;
                pagoTotal = pxhn + pxhe;
                break;

            case 2:
                if (horasTrabajadas <= 40) {
                    horasN = horasTrabajadas;
                    horasEx = 0;
                } else {
                    horasEx = horasTrabajadas - 40;
                    horasN = 40;
                    if (horasEx > 15) {
                        horasEx = 15;
                    }
                }
                pxhn = horasN * 35.99;
                pxhe = horasEx * 50;
                pagoTotal = pxhn + pxhe;
                break;

            case 3:
                if (horasTrabajadas <= 40) {
                    horasN = horasTrabajadas;
                    horasEx = 0;
                } else {
                    horasEx = horasTrabajadas - 40;
                    horasN = 40;
                    if (horasEx > 15) {
                        horasEx = 15;
                    }
                }
                pxhn = horasN * 35.99;
                pxhe = horasEx * 85;
                pagoTotal = pxhn + pxhe;
                break;

            case 4:
                if (horasTrabajadas <= 40) {
                    horasN = horasTrabajadas;
                    horasEx = 0;
                } else {
                    horasEx = horasTrabajadas - 40;
                    horasN = 40;
                    if (horasEx > 15) {
                        horasEx = 15;
                    }
                }
                pxhn = horasN * 35.99;
                pxhe = horasEx * 0;
                pagoTotal = pxhn + pxhe;
                break;

            default:
                System.out.println("Categoría no válida");

        }
        String pagoTotalU = String.format("%.2f", pagoTotal);

        System.out.println("** BOLETA **");
        System.out.println("Código de Empleado: " + codigoEmpleado);
        System.out.println("Nombre de Empleado: " + nombreCompleto);
        System.out.println("Cantidad de horas trabajadas: " + horasTrabajadas + " horas");
        System.out.println("Cantidad de horas extras: " + horasEx + " horas");
        System.out.println("Pago extra: $" + pxhe);
        System.out.println("Pago neto: $" + pagoTotalU);
    }
}
