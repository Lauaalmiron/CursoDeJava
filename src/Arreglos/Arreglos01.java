package Arreglos;

import java.util.Scanner;

public class Arreglos01 {
    public static void main(String[] args) {

        /*
         * Ejercicio 1:
         * Escriba un programa que solicite al usuario un valor entero para establecer el tamaño de un
         * arreglo de números enteros. Luego utilice ese valor para crear el arreglo y posteriormente
         * solicitar al usuario que ingrese cada uno de los valores para completar el arreglo.
         * Finalmente, imprima por pantalla la lista de valores ingresados por el usuario en:
         * a) El mismo orden en que fueron leídos por el teclado.
         * b) En orden inverso al que fueron cargados.
         * c) Una lista de todos los números pares.
         * d) Un lista de todos los valores que se encuentran ubicados en posiciones impares en el
         * arreglo.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanio de arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingrese los valores para completar arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        for (int Avestruz : arreglo) {
            System.out.print(Avestruz + " ");
        }







    }
}