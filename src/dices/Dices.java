/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dices;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mark
 */
public class Dices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean game = true;
        while (game = true){
            System.out.println("Programa gay del mark");
            System.out.println("Hola, Bienvenido a Minijuegos");
            System.out.println("1 Evaluar resultado de 3 lanzamientos de dados");
            System.out.println("2 Leer 20 numeros");
            System.out.println("3 Multiplicaciones");
            System.out.println("4 Adivinanza");
            System.out.println("5 Salir");

            Scanner sc = new Scanner(System.in);    
            System.out.println("Que vas a jugar?");
            int opcionMenu = sc.nextInt();

            Random random = new Random();
            switch(opcionMenu){
                case 1:
                    System.out.println("Dados");
                    System.out.println("");
                    int dado1 = random.nextInt(6) + 1;
                    int dado2 = random.nextInt(6) + 1;
                    int dado3 = random.nextInt(6) + 1;

                    System.out.println(dado1);
                    System.out.println(dado2);
                    System.out.println(dado3);

                    if(dado1 == 6 && dado2 == 6 && dado3 == 6){
                        System.out.println("Tiro Excelente!");
                        System.out.println("");
                    }
                    else if(dado1==6 && dado2==6 || dado1==6 && dado3==6 || dado2==6 && dado3==6){
                        System.out.println("Muy buen tiro!");
                        System.out.println("");
                    }
                    else if(dado1==6 || dado2==6 || dado3==6){
                        System.out.println("Tiro Regular.");
                        System.out.println("");
                    }
                    else{
                        System.out.println("Pesimo Tiro...");
                        System.out.println("");
                    }

                    break;
                case 2:
                    System.out.println("20 Numeros");
                    System.out.println("");
                    int contador20 = 0;
                    int numeroAnterior = 0;
                    int suma = 0;
                    while (contador20 != 5){
                        System.out.println("Dame un numero mayor a 20");
                        int numero = sc.nextInt();
                        if (numero < 20){
                            System.out.println("Numero menor a 20");
                        }
                        else if((numero%2)==0){
                            suma = numero + numeroAnterior;
                            numeroAnterior = suma;
                            contador20++;
                            System.out.println("Tu suma hasta ahora es: " + suma);
                        }
                        else{
                            suma = numero + numeroAnterior;
                            numeroAnterior = suma;
                            System.out.println("Tu suma hasta ahora es: " + suma);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Multiplicaciones");
                    System.out.println("");
                    int resultado = 0;
                    int x1 = random.nextInt(100) + 1;
                    int x2 = random.nextInt(100) + 1;
                    resultado = x1 * x2;
                    int errores = 0;
                    int respuesta = 0;
                    while (errores != 5 && respuesta != resultado){
                        System.out.println("Tu multiplicacion es: " + x1 + "*" + x2 );
                        System.out.println("Cual es tu repuesta?");
                        respuesta = sc.nextInt();
                        if(respuesta == resultado){
                            System.out.println("Felicidades! Sabes multiplicar!");
                        }
                        else{
                            System.out.println("Respuesta incorrecta, intenta otra vez por favor");
                            errores++;
                        }
                    }
                    if(errores == 5){
                        System.out.println("La respuesta correcta era: " + resultado);
                    }
                    break;
                case 4:
                    System.out.println("Adivinanza");
                    System.out.println("");
                    int adivinanza = random.nextInt(100) + 1;
                    int adivinacion = 0;
                    while (adivinacion != adivinanza){
                        System.out.println("Tengo un numero del 1 al 100, puedes adivinar cual es?");
                        adivinacion = sc.nextInt();
                        if(adivinacion < adivinanza){
                            System.out.println("Numero muy bajo, intenta otra vez");
                        }
                        else if(adivinacion > adivinanza){
                            System.out.println("Numero muy ato, intenta otra vez");
                        }
                        else if(adivinacion == adivinanza){
                            System.out.println("Felicidades!, le atinaste");
                            break;
                        }
                        else{
                            System.out.println("No reconozco eso");
                        }
                    }    
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
    
}
