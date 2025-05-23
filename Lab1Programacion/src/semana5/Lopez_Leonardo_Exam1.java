/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;


import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author hnleo
 */
public class Lopez_Leonardo_Exam1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
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
                case 1:   //Seccion piramide
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

                case 2: // Seccion cifrado/decifrado
                    int selec = 0;
                     do{
                         System.out.println("\n** Cifrado/Decifrado de mensajes **");
                         System.out.println("1. Cifrar mensaje");
                         System.out.println("2. Decifrar mensaje");
                         System.out.println("3. Regresar");
                         System.out.print("Elige una opcion: ");
                         selec = leer.nextInt();
                         
                         switch(selec){
                             case 1: 
                                 System.out.println("\n** CIFRAR MENSAJE **\n");
                                 System.out.print("Ingrese mensaje de texto a cifrar: ");
                                 String mensaje = leer.next();
                                 char letraNormal = ' ', opuesto= ' ';
                                 String mensajeCifrado = "";
                                 
                                 for(int i = 0; i<mensaje.length();i++){
                                     letraNormal = mensaje.charAt(i);
                                     
                                     if(letraNormal>= 'a' && letraNormal <='z') //condicion para convertir en opuestas las letras minusculas
                                     {
                                        opuesto = (char) ('z'-(letraNormal - 'a'));
                                     } else if (letraNormal >= 'A' && letraNormal<='Z')// condicion para convertir en opuestas las letras mayusculas
                                     {
                                         opuesto = (char)('Z' - (letraNormal - 'A'));
                                     }else //Si es signo, espacio o numero pasa aqui.
                                     {
                                         opuesto = letraNormal;
                                     }
                                     mensajeCifrado+=opuesto;
                                 }
                                 System.out.println("Mensaje cifrado: "+mensajeCifrado);
                                 break;
                             case 2: 
                                 System.out.println("\n** DECIFRAR MENSAJE **");
                                 break;
                             case 3:
                                 System.out.println("\n** REGRESANDO **\n");
                                 break;
                             default:
                                 System.out.println("\n** Ingrese opcion valida **");
                                 break;
                         }
                     }while(selec!=3);
                    break;

                case 3: //Seccion juego de piedra papel o tijera
                    Random randResp = new Random();

                    String resp = "";
                    String eleccion = "";
                    System.out.println("\n**Bienvendio al juego de PIEDRA, PAPEL O TIJERA **\nEn este juego jugaras contra la computadora. \n¿Estas Listo?\n");
                    do {
                        do {
                            System.out.print("Elige (Piedra/Papel/Tijera): ");
                            eleccion = leer.next().toLowerCase();
                        } while (!eleccion.equalsIgnoreCase("piedra") && !eleccion.equalsIgnoreCase("papel") && !eleccion.equalsIgnoreCase("tijera"));
                        int respuestaCPU = randResp.nextInt(3) + 1;

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
                        if ((eleccion.equalsIgnoreCase("piedra") && respuestaCPU == 3) || (eleccion.equalsIgnoreCase("papel") && respuestaCPU == 1)
                                || (eleccion.equalsIgnoreCase("tijera") && respuestaCPU == 2)) {
                            System.out.println("Ganaste.");
                        }
                        if ((eleccion.equalsIgnoreCase("piedra") && respuestaCPU == 2) || (eleccion.equalsIgnoreCase("papel") && respuestaCPU == 3)
                                || (eleccion.equalsIgnoreCase("tijera") && respuestaCPU == 1)) {
                            System.out.println("Perdiste.");
                        }

                        System.out.print("\nDesea continuar (si/no): ");
                        resp = leer.next();
                    } while (resp.equalsIgnoreCase("si"));
                    System.out.println("\n");
                    break;

                case 4: //Seccion de adivinar
                    System.out.println("\n** ADIVINAR **");
                    Random random = new Random();
                    int numAle = random.nextInt(1, 100);
                    int num = 0, contInt=0;
                    System.out.println("Computadora: Adivina el numero que estoy pensando..");
                   
                    for(int i = 1;i<=10; i++){
                        System.out.print("Numero: ");
                        num = leer.nextInt();
                        contInt++;
                        if(num == numAle){
                            System.out.println("¡Haz Acertado!, te tomo "+contInt+" intentos.\n");
                            break;
                        }
                        
                        if(num>numAle){
                            System.out.println("El numero que introduciste es mayor.");
                        }else if(num<numAle){
                            System.out.println("El numero que introduciste es menor.");
                        }
                        
                    }
                    if(contInt==10){
                    System.out.println("\nNo lograste adivinar, el numero que estaba pensando era: "+numAle+"\nSuerte a la proxima.\n");
                    }
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
