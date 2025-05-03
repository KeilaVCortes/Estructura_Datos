
// Clase Nodo que representará cada elemento de la pila
class Nodo {
    String libro;  // Valor del libro
    Nodo siguiente;  // Puntero al siguiente nodo

    // Constructor
    public Nodo(String libro) {
        this.libro = libro;
        this.siguiente = null;
    }
}

// Clase Pila que utiliza nodos
class Pila {
    private Nodo cima;  // Puntero al nodo en la cima de la pila

    // Constructor para inicializar la pila vacía
    public Pila() {
        this.cima = null;
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Método para apilar un libro
    public void apilar(String libro) {
        Nodo nuevoNodo = new Nodo(libro);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Método para desapilar (eliminar) el libro en la cima
    public String desapilar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        String libro = cima.libro;
        cima = cima.siguiente;
        return libro;
    }

    // Método para mostrar todos los elementos de la pila
    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        Nodo actual = cima;
        System.out.println("Elementos en la pila:");
        while (actual != null) {
            System.out.println(actual.libro);
            actual = actual.siguiente;
        }
    }
}

// Clase principal para demostrar el uso de las pilas A y B
public class Pila_Ejem{
    public static void main(String[] args) {
        // Crear la pila A con 5 libros
        Pila pilaA = new Pila();
        pilaA.apilar("Libro 5");
        pilaA.apilar("Libro 4");
        pilaA.apilar("Libro 3");
        pilaA.apilar("Libro 2");
        pilaA.apilar("Libro 1");

        // Mostrar la pila A antes de transferir a la pila B
        System.out.println("Pila A antes de transferir a Pila B:");
        pilaA.mostrarPila();

        // Crear la pila B y transferir los libros de la pila A a la pila B
        Pila pilaB = new Pila();
        while (!pilaA.estaVacia()) {
            String libro = pilaA.desapilar();  // Desapila de A
            pilaB.apilar(libro);               // Apila en B
        }

        // Mostrar la pila B después de la transferencia
        System.out.println("\nPila B después de la transferencia:");
        pilaB.mostrarPila();
    }
}
