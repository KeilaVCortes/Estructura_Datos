//Crear un programa en java usando un arreglo  con los valores de [00,70,50,10,80,20,60,30,40,90], 
//y se elimine el valor según su posición en un vector estático

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        // Crear el arreglo con los valores dados
        int[] numeros = {00, 70, 50, 10, 80, 20, 60, 30, 40, 90};
        Scanner sc = new Scanner(System.in); //permite leer datos por teclado

        // Mostrar los valores originales del arreglo
        System.out.println("Valores originales en el arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // Pedir al usuario la posición del valor a eliminar
        System.out.print("\nIntroduce la posición del valor que deseas eliminar (0-9): ");
        int posicion = sc.nextInt();

        // Validar si la posición es válida
        if (posicion < 0 || posicion >= numeros.length) {
            System.out.println("Posición inválida.");
        } else {
            // Crear un nuevo arreglo con tamaño menor
            int[] nuevoArreglo = new int[numeros.length - 1];

            // Copiar los valores, excepto el de la posición eliminada
            for (int i = 0, j = 0; i < numeros.length; i++) {
                if (i != posicion) {
                    nuevoArreglo[j++] = numeros[i];
                }
            }

            // Mostrar los valores actualizados
            System.out.println("\nValores en el arreglo después de eliminar la posición " + posicion + ":");
            for (int numero : nuevoArreglo) {
                System.out.println(numero);
            }
        }

        sc.close();
    }
}
