import java.util.LinkedList;
import java.util.Queue;

public class pila_00 {
    public static void main(String[] args) {
    Queue pila_A = new LinkedList();

    pila_A.add("1");
    pila_A.add("2");
    pila_A.add("3");
    pila_A.add("4");

     // Imprimiendo contenido de la pila A
     System.out.println("Contenido de la pila A: " + pila_A);

    Queue pila_B = GetB(pila_A);
     // Imprimiendo contenido de la pila B
     System.out.println("----------------------------------");
        System.out.println("Contenido de la pila B: " + pila_B);
}

public static Queue GetB(Queue pila_A){
    Queue pila_B = new LinkedList();
    for (int i = 0; i < pila_A.size(); i++) {
        pila_B.add(pila_A.toArray()[i]);
        System.out.println("+"+pila_B);
    }

    return pila_B;
}
}
