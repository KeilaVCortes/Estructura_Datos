class NodoArbol {
    int valor;
    NodoArbol izquierdo, derecho;

    // Constructor de Nodo que recibe un valor
    public NodoArbol(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class arbolbinario2 {
    NodoArbol raiz;

    // Método público para insertar un nodo en el árbol binario de búsqueda
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Método privado recursivo para la inserción
    private NodoArbol insertarRecursivo(NodoArbol nodo, int valor) {
        if (nodo == null) {
            return new NodoArbol(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }
        return nodo;
    }

    // Método para realizar el recorrido in-order
    void recorridoInOrder(NodoArbol nodo) {
        if (nodo != null) {
            recorridoInOrder(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInOrder(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        arbolbinario2 arbol = new arbolbinario2();

        // Lista de elementos a insertar
        int[] elementos = {35, 8, 15, 60, 63, 50, 4, 70, 52, 12};
        for (int elemento : elementos) {
            arbol.insertar(elemento);
        }

        // Llamada al método de recorrido in-order
        System.out.print("Elementos Arbol= ");
        arbol.recorridoInOrder(arbol.raiz);
    }
}

