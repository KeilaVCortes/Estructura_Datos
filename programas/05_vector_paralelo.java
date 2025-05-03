
//Vector paralelo, pedir el numero de usuario del jugador e imprimir su posición en el vector y puntaje


import java.util.Scanner;

public class JugadoresPuntajes {
    public static void main(String[] args) {
        // Arreglo de puntajes
        int[] puntajes = {0, 70, 50, 10, 80, 20, 60, 30, 40, 90};
        // Arreglo de jugadores
        String[] jugadores = {"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10"};

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de usuario del jugador
        System.out.print("Ingrese el número de jugador (1-10): ");
        int numeroJugador = scanner.nextInt();

        // Verificar que el número esté dentro del rango válido
        if (numeroJugador >= 1 && numeroJugador <= 10) {
            // Convertir el número de jugador a índice (restar 1)
            int posicion = numeroJugador - 1;

            // Imprimir la posición y el puntaje del jugador
            System.out.println("Jugador: " + jugadores[posicion]);
            System.out.println("Posición en el vector: " + posicion);
            System.out.println("Puntaje: " + puntajes[posicion]);
        } else {
            // Mensaje de error si el número no está en el rango válido
            System.out.println("Número de jugador inválido. Debe ser entre 1 y 10.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
