import java.util.Scanner;// Librerias para leer

public class add_array {
    public static void main(String[] args) {
    
                // Creamos un escáner para recibir entrada del usuario
                Scanner scanner = new Scanner(System.in);
        
                // Creamos un arreglo con un tamaño de 10 para almacenar los números
                int[] numeros = new int[10];
                
                // Inicializamos el arreglo con ceros o un valor predeterminado
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = 0; // Asignamos 0 como valor inicial
                }
                
                // Solicitamos al usuario ingresar un número y el índice donde agregarlo
                for (int i = 0; i < 10; i++) {
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    
                    System.out.print("Ingrese el índice (0-9) donde desea colocar el número: ");
                    int indice = scanner.nextInt();
                    
                    // Verificamos que el índice esté dentro del rango del arreglo
                    if (indice >= 0 && indice < numeros.length) {
                        numeros[indice] = numero; // Insertamos el número en el índice indicado
                    } else {
                        System.out.println("Índice fuera de rango. Inténtelo de nuevo.");
                        i--; // Volvemos a solicitar un número y un índice válido
                    }
                }
                
                // Mostramos los números ingresados en el arreglo
                System.out.println("\nEl contenido del arreglo es:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println("Índice " + i + ": " + numeros[i]);
                }
                
                // Cerramos el escáner
                scanner.close();
        
    }

}
