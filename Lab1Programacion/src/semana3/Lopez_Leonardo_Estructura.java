/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author hnleo
 */
public class Lopez_Leonardo_Estructura {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        int opSeleccion = 0, contadorPalabra = 0, contadorMax = 0;
        int contadorPalabraReves = 0, contadorNumeroPerfecto = 0, contadorPrimo = 0, contadorVotaciones = 0;
        char letraReves = ' ';
        String palabraMax = "", palabraReves = "", palabraRevesMax = "";
      

        do {
            System.out.println("=======**  MENU PRINCIPAL  **=======\n");
            System.out.println("1. Palabra Alreves");
            System.out.println("2. Numero Perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opSeleccion = leer.nextInt();

            switch (opSeleccion) {

                // Palabra Alréves
                case 1:
                    System.out.println("\n======================================");
                    contadorPalabraReves++;
                    System.out.print("\nIngrese una cantidad deseada de palabras: ");
                    int cantidadPalabras = leer.nextInt();

                    for (int i = 1; i <= cantidadPalabras; i++) {
                        palabraReves = "";
                        System.out.println("\n");
                        System.out.print("Palabra #" + i + ": ");
                        String palabra = leer.next().toLowerCase();
                        System.out.print("Al réves: ");

                        for (int j = palabra.length() - 1; j >= 0; j--) {
                            letraReves = palabra.charAt(j);
                            System.out.print(letraReves);
                            palabraReves += palabra.charAt(j);
                        }

                        contadorPalabra = letraReves;
                        if (contadorPalabra > contadorMax) {
                            contadorMax = contadorPalabra;
                            palabraMax = palabra;
                            palabraRevesMax = palabraReves;
                        }

                        if (palabra.equals(palabraReves)) {
                            System.out.println("\nEs palíndromo");

                        }

                    }
                    System.out.println("\nLa palabra más larga es: " + palabraMax);
                    System.out.println("\n======================================\n");

                    break;

                // Numero Perfecto
                case 2:
                    contadorNumeroPerfecto++;
                    System.out.print("\nIngrese un numero:  ");
                    int N = leer.nextInt();
                    int sumadeN = 0;

                    for (int i = 1; i < N; i++) {
                        if (N % i == 0) {
                            sumadeN += i;
                        }
                    }
                    if (sumadeN == N) {
                        System.out.println("Es un número perfecto.");
                    } else {
                        System.out.println("No es un número perfecto.");
                    }
                    break;
                // Numeros Primos
                case 3:
                    contadorPrimo++;
                    int divisores = 0;
                    Random aleatorio = new Random();
                    int aleatorioN = aleatorio.nextInt(1, 100);

                    System.out.println("\nEl numero elegido es: " + aleatorioN);
                    System.out.print("Divisores: ");

                    for (int i = 1; i <= aleatorioN; i++) {
                        if (aleatorioN % i == 0) {
                            System.out.print(i + " ");
                            divisores++;
                        }
                    }
                    if (divisores == 2) {
                        System.out.println("\nEs Primo");
                    } else {
                        System.out.println("\nNo es primo");
                    }

                    break;

                case 4:
                    contadorVotaciones++;
                    System.out.print("\n¿Cuantos votantes hay en el pais?: ");
                    int cantidadVotantes = leer.nextInt();
                    int contadorAzul = 0,
                     contadorRojo = 0,
                     contadorNegro = 0,
                     contadorAmarillo = 0,
                     contadorGeneral = 0,
                     contadorInvalido = 0,
                     votosTotalesValidos = 0;
                 
                    double votoCalculo = 0;
                     
                    for (int i = 1; i <= cantidadVotantes; i++) {
                        System.out.println("\n¿Por cual desea votar?\n\nAZUL | ROJO | NEGRO | AMARILLO");
                        System.out.print("Voto: ");
                        String voto = leer.next().toLowerCase();

                        switch (voto) {
                            case ("azul"):
                                contadorAzul++;
                                contadorGeneral++;
                                break;

                            case ("rojo"):
                                contadorRojo++;
                                contadorGeneral++;
                                
                            case("negro"):
                                contadorNegro++;
                                contadorGeneral++;
                                
                            case("amarillo"):
                                contadorAmarillo++;
                                contadorGeneral++;
                            
                            default:
                                contadorInvalido++;
                                contadorGeneral++;
                        }
                        
                        
                    }
                    
                    votosTotalesValidos = contadorAzul + contadorRojo + contadorNegro + contadorAmarillo;
                    
                    votoCalculo = (votosTotalesValidos/cantidadVotantes)*100;
                    
                    if(contadorAzul>contadorRojo && contadorAzul>contadorNegro && contadorAzul>contadorAmarillo){
                        if(votoCalculo>=60){
                     System.out.println("Planilla ganadora: AZUL");

                    }else{
                        System.out.println("Votacion Fallida");
                    }
                    }
                    if(contadorRojo>contadorAzul && contadorRojo>contadorNegro && contadorRojo>contadorAmarillo){
                        if(votoCalculo>=60){
                     System.out.println("Planilla ganadora: ROJO");

                    }else{
                        System.out.println("Votacion Fallida");
                    }
                    }
                    if(contadorNegro>contadorAzul && contadorNegro>contadorRojo && contadorNegro>contadorAmarillo){
                        if(votoCalculo>=60){
                     System.out.println("Planilla ganadora: NEGRO");

                    }else{
                        System.out.println("Votacion Fallida");
                    }
                    }
                    if(contadorAmarillo>contadorAzul && contadorAmarillo>contadorRojo && contadorAmarillo>contadorNegro){
                        if(votoCalculo>=60){
                     System.out.println("Planilla ganadora: AMARILLO");

                    }else{
                        System.out.println("Votacion Fallida");
                    }
                    }
                    break;
                    
                case 5: 
                    System.out.println("\n======================================");
                    System.out.println("Cantidad de veces abiertas");
                    System.out.println("Seccion de Palabra Alreves: "+contadorPalabraReves+" ");
                    System.out.println("Seccion de Numero Perfecto: "+contadorNumeroPerfecto+" ");
                    System.out.println("Seccion de Numero Primo: "+contadorPrimo+" ");
                    System.out.println("Seccion de Votaciones: "+contadorVotaciones+" ");
                    System.out.println("======** SALIENDO DEL SISTEMA **=======");
                          
            }

        } while (opSeleccion != 5 && opSeleccion<=4);
    }

}
