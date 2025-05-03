import java.util.Scanner;

public class AddElement_ini {
    public static void main(String[] args) {
        int[] posiciones = {00, 50, 70, 80, 20, 60, 30, 40, 90};
        Scanner scanner = new Scanner(System.in);

        //Memoria DINAMICA
        // Solicita el número de elementos a agregar
        System.out.println("¿Cuántos elementos deseas agregar?");
        int elementos = scanner.nextInt();

        // Crear un nuevo vector con espacio adicional para los nuevos elementos
        int[] nuevoVector = new int[posiciones.length + elementos];

        // Solicita los nuevos elementos y los agrega al inicio del nuevo vector
        for (int i = 0; i < elementos; i++) {
            System.out.println("Dame el valor del nuevo elemento:");
            nuevoVector[i] = scanner.nextInt();
        }

        // Copiar el contenido del vector original en el nuevo vector después de los nuevos elementos
        for(int i = 0; i < posiciones.length; i++) {
            nuevoVector[i + elementos] = posiciones[i];
        }

        // Muestra el vector final
        System.out.println("El nuevo vector es:");
        for (int i = 0; i < nuevoVector.length; i++) {
            System.out.print(nuevoVector[i] + " ");
        }

        // Cierra el scanner para evitar fugas de recursos
        scanner.close();
    }
}
