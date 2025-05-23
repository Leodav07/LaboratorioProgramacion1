/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

import java.awt.BorderLayout;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author hnleo
 */
public class Lopez_Leonardo_Exam1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opSeleccion = 0;
        do {
            System.out.println("** MENU PRINCIPAL **");
            System.out.println("  1. PIRAMIDE");
            System.out.println("  2. CLAVE");
            System.out.println("  3. PIEDRA, PAPEL Y TIJERA");
            System.out.println("  4. ADIVINAR");
            System.out.println("  5. SALIR");
            System.out.println("=======================\n");
            System.out.print("Seleccione una opcion: ");
            opSeleccion = leer.nextInt();

            switch (opSeleccion) {
                case 1:
                    int numFila = 0,
                     sumaN = 0;
                    int imparNum = 1;

                    System.out.print("\nCantidad de fila de la piramide: ");
                    numFila = leer.nextInt();

                    for (int i = 1; i <= numFila; i++) {
                        sumaN = 0;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(imparNum + " ");
                            sumaN += imparNum;
                            imparNum += 2;
                        }

                        System.out.println("= " + sumaN);
                    }
                    System.out.println("\n");

                    break;

                case 2:

                    break;

                case 3:
                    Random randResp = new Random();

                    String resp = "";
                    String eleccion = "";
                    System.out.println("\n**Bienvendio al juego de PIEDRA, PAPEL O TIJERA **\nEn este juego jugaras contra la computadora. \n¿Estas Listo?\n");
                    do {
                        do {
                            System.out.print("Elige (Piedra/Papel/Tijera): ");
                            eleccion = leer.next().toLowerCase();
                        } while (!eleccion.equalsIgnoreCase("piedra") && !eleccion.equalsIgnoreCase("papel") && !eleccion.equalsIgnoreCase("tijera"));
                        int respuestaCPU = randResp.nextInt(1, 3);

                        switch (respuestaCPU) {
                            case 1:
                                System.out.println("Computadora: Piedra");
                                break;
                            case 2:
                                System.out.println("Computadora: Papel");
                                break;
                            case 3:
                                System.out.println("Computadora: Tijera");
                                break;
                            default:
                                break;
                        }
                        if ((eleccion.equalsIgnoreCase("piedra") && respuestaCPU == 1) || (eleccion.equalsIgnoreCase("papel") && respuestaCPU == 2)
                                || (eleccion.equalsIgnoreCase("tijera") && respuestaCPU == 3)) {
                            System.out.println("Empate.");
                        }
                        
                        System.out.print("Desea continuar (si/no): ");
                        resp = leer.next();
                    } while (resp.equalsIgnoreCase("si"));
                    System.out.println("\n");
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("** Finalizando programa **");
                    break;

                default:
                    System.out.println("\nSelecciona una opcion valida.\n");
            }

        } while (opSeleccion != 5);

    }
}
