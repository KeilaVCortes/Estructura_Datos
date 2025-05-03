
import java.util.Scanner;

public class Arreglo_01 {
 public static void main(String[] args) {
    //Crear un Escanner de Entrada
    Scanner scanner= new Scanner(System.in);

    //Creación del arrreglo
    int[] numeros = new int[10];

    //Pedir el valor de los numeros
    System.out.print("Ingresa el valor de los numeros");

    for (int i = 0; i < 10; i++) {
        //System.out.print("Número " + (i + 1) + ": ");
        System.out.print("Numero en el índice"+ i +":" );
        numeros[i] = scanner.nextInt();
    }

    // Mostramos los números ingresados (en el orden en que se introdujeron)
     System.out.println("\nLos números ingresados son:");
    for (int i = 0; i < 10; i++) {
         System.out.println("Número " + (i + 1) + ": " + numeros[i]);
    }
 
    // Cerramos el escáner
    scanner.close();


 }   
}
