package lab6.lab6p1_eduardochinchilla;

import java.util.Scanner;
import java.util.Random;

public class Lab6P1_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 3) {

            opcion = menu();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el size: ");
                    int size = read.nextInt();
                    //validacion del size
                    while (size < 1) {
                        System.out.println("No puede ser menor a 1: ");
                        System.out.println("Ingrese el size: ");
                        size = read.nextInt();
                    }

                    System.out.println("Ingrese el limite inferior: ");
                    int liminf = read.nextInt();
                    System.out.println("Ingrese el limite superior: ");
                    int limsup = read.nextInt();
                    //validacion de limites
                    while (limsup < liminf) {
                        System.out.println("Error, el limite superior debe ser mayor");
                        System.out.println("Ingrese el limite inferior: ");
                        liminf = read.nextInt();
                        System.out.println("Ingrese el limite superior: ");
                        limsup = read.nextInt();
                    }
                    //generar el arreglo
                    int[] array = new int[size];
                    array = genRandArray(size, liminf, limsup);
                    System.out.print("arreglo generado:" + " ");
                    imprArray(array);
                    System.out.println(" ");
                    for (int i = 0; i < array.length; i++) {
                        int numero = array[i];
                        System.out.println("numero que saca"+numero);
                        
                        System.out.println(countPrimeFactors(numero));

                        int[] array2 = new int[size];
                        array2 = getTotalPrimeCount(array2);
                        imprArray(array2);
                    }

                    break;
                }
                case 2: {
                    System.out.println("Ingrese una cadena: ");
                    String s = read.next();
                    for (int i = 0; i < s.length(); i++) {
                        char carac = s.charAt(i);

                        if (carac >= 97 && carac <= 122 || carac == 160 || carac == 161 || carac == 130 || carac == 162 || carac == 163 || carac == 129 || carac == 164) {
                            imprArray(extraerFrecuencias(s));
                            
                            break;
                        } else {
                            System.out.println("Error");
                            System.out.println("Ingrese una cadena");
                            s = read.next();
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Ha salido");
                    break;
                }

                default:
                    System.out.println("Error opcion ingresada incorrecta");
            }
        }
    }//fin main

    public static int menu() {

        int op = 0;

        System.out.println("Menu");
        System.out.println("1. Cuantos primos tiene");
        System.out.println("2. frecuencia de letras");
        System.out.println("3. Salir");

        op = read.nextInt();

        return op;
    }

    public static void imprArray(int[] temp) {

        for (int i = 0; i < temp.length; i++) {
            System.out.print("[" + temp[i] + "]");
        }

    }

    public static int[] genRandArray(int size, int liminf, int limsup) {
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {

            temp[i] = liminf + rand.nextInt(limsup - 1);
        }
        return temp;
    }

    public static boolean isPrime(int num) {

        int i = 1;
        boolean f = false;
        int cont = 0;

        while (i <= num) {
            if (num % i == 0) {
                cont++;
            }
            i++;
        }
        if (cont == 2) {
            f = true;
        } else {
            f = false;
        }

        return f;
    }

    public static int countPrimeFactors(int num) {
        int divisor = 2;
        int cont = 0;
        int cont2 = 0;
        int i = 1;

        while (i <= num) {
            if (num % i == 0) {
                cont++;
            }
            i++;
        }
        if (cont == 2) {
            while (divisor <= num) {
                if (divisor % num == 0) {
                    num = num / divisor;
                    cont2++;
                } else {
                    divisor += 1;
                }

            }
        }

        return cont2;
    }

    public static int[] extraerFrecuencias(String s) {
        int[] temp = new int[27];
        
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            for (int j = 0; j < temp.length; j++) {
                
            }
        }

        return temp;
    }

    public static int[] getTotalPrimeCount(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < temp.length; i++) {

        }

        return temp;
    }

}//fin class
