class NodoArbol { //Plantilla del árbol binario
    int valor;
    NodoArbol izquierdo, derecho;

    // Constructor de Nodo que recibe un valor
    public NodoArbol(int valor) {  //almacena el valor del elemento, crea Hijo-Izq e Hijo-Der
        this.valor = valor;   
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class ArbolBinario {
    NodoArbol raiz;

    // Método para iniciar el recorrido in-order
    void recorridoInOrder(NodoArbol nodo) {
        if (nodo != null) {
            recorridoInOrder(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInOrder(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Creación de los nodos según la estructura dada
        arbol.raiz = new NodoArbol(35);
        arbol.raiz.izquierdo = new NodoArbol(8);
        arbol.raiz.derecho = new NodoArbol(15);
        arbol.raiz.izquierdo.izquierdo = new NodoArbol(4);
        arbol.raiz.izquierdo.derecho = new NodoArbol(12);
        arbol.raiz.derecho.derecho = new NodoArbol(60);

        // Llamada al método de recorrido in-order
        System.out.println("Recorrido In-Order del árbol binario:");
        arbol.recorridoInOrder(arbol.raiz);
    }
}