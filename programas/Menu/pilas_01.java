import java.util.Stack; // Asegurarse de importar la clase Stack

public class pilas_01 {
    public static void main(String[] args) {
        // Pilas con la clase Stack
        Stack<String> libros = new Stack<>(); // Crear una pila de libros

        // Agregando elementos a la pila
        libros.push("Libro_1");
        libros.push("Libro_2");
        libros.push("Libro_3");

        // Mostrando la pila
        System.out.println(libros);

        // Ver el último elemento
        System.out.println("Último elemento: " + libros.peek());

        // Eliminar el último elemento
        System.out.println("Último elemento eliminado: " + libros.pop());

        // Ver luego de eliminar
        System.out.println(libros);

        // Buscar elemento
        System.out.println("Ubicación de Libro_1 respecto a la parte superior: " + libros.search("Libro_1"));
    }
}
---