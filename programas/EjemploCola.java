import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {
        // Crear una cola
        Queue<Integer> cola = new LinkedList<>();

        // Insertar 7 elementos en la cola
        cola.offer(10);
        cola.offer(20);
        cola.offer(30);
        cola.offer(40);
        cola.offer(50);
        cola.offer(60);
        cola.offer(70);

        // Mostrar la cola
        System.out.println("Elementos en la cola: " + cola);

        // Eliminar elementos de la cola
        System.out.println("Elemento removido: " + cola.poll());
        System.out.println("Elemento removido: " + cola.poll());

        // Mostrar la cola después de eliminar elementos
        System.out.println("Cola después de eliminar dos elementos: " + cola);

        // Ver el elemento en el frente de la cola sin eliminarlo
        System.out.println("Elemento en el frente de la cola: " + cola.peek());

        // Verificar si la cola está vacía
        System.out.println("¿Está vacía la cola? " + cola.isEmpty());
    }
}
