import java.util.Scanner;

public class Algoritmos_ordenacion {
    public static void main(String[] args) {
        // Creacion de un arreglo
        int[] elementos = { 38, 18, 50, 8, 6, 100, 94, 90, 22, 10 };

        // Mostrar elementos
        System.out.println("Vector Inicial:");
        // Recorrido de un vector
        for (int i = 0; i <= 9; i++) {
            System.out.println("Elemento " + i + ": " + elementos[i]);
        }

        // Declaración de variable OPCION
        Scanner teclado = new Scanner(System.in);
        int opcion;// Declarando la variable para almacenar la opcion

        do {
            System.out.println("          +*+*+* MENU PRINCIPAL *+*+*");
            System.out.println("   A) ALGORITMOS DE ORDENACION INTERNA");
            System.out.println("      1.- Burbuja (BubbleSort)");
            System.out.println("      2.- QuickSort");
            System.out.println("      3.- ShellSort");
            System.out.println("      4.- Radix");
            System.out.println("   B) ALGORITMOS DE ORDENACION EXTERNA");
            System.out.println("      5.- Intercalación");
            System.out.println("      6.- Mezcla directa (MergeSort)");
            System.out.println("      7.- Mezcla Natural");
            System.out.println(" 8.- Salida");
            System.out.println("Elige una opción:");

            // Leer opción
            opcion = teclado.nextInt();

            // LLAMADO A LAS FUNCIONES
            // ciclo Switch
            switch (opcion) {
                case 1: // BURBUJA
                    burbuja(elementos);
                    System.out.println("Vector ordenado con Burbuja:");
                    mostrarVector(elementos);
                    break;
                case 2: // quick_sort();
                    quickSort(elementos, 0, elementos.length - 1);
                    System.out.println("Vector ordenado con QuickSort:");
                    mostrarVector(elementos);
                    break;
                case 3:
                    // shell_sort();
                    System.out.println("Vector ordenado con Shell_sort:");
                    break;
                case 4:
                    // Radix();
                    System.out.println("Vector ordenado con Radix");
                    break;
                case 5:
                    // Intercalación();
                    System.out.println("Vector ordenado con Intercalación:");
                    break;
                case 6:
                    // Mezcla_Directa();
                    System.out.println("Vector ordenado con Mezcla Directa:");
                    break;
                case 7:
                    // Mezcla_Natural();
                    System.out.println("Vector ordenado con Mezcla Natural:");
                case 8:// SALIDA
                    System.out.println("Fin del programa");
                    break;
                // default:
                // break;
            }
        } while (opcion != 7);// condicion

        teclado.close(); // Cerrar el Scanner
    }

    // Método para mostrar el vector
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + i + ": " + vector[i]);
        }
    }

    // Algoritmo Burbuja
    // números de manera ASCENDENTE
    public static void burbuja(int[] vector) {
        int n = vector.length; // asigna el tamaño del vector a la variable "n"
        // Ciclo que controla el número de pasadas por el arreglo.
        for (int i = 0; i < n - 1; i++) {// recorre el vector desde 0 hasta n-1
            // Ciclo que realiza las comparaciones y los intercambios necesarios en un
            // vector AUXILIAR
            // Reduce el número de iteraciones en cada pasada porque los elementos finales
            // ya estarán ordenados.
            for (int j = 0; j < n - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {// Compara el elemento actual con el siguiente.
                    // Si el elemento actual es mayor que el siguiente, se realiza el intercambio.
                    int temp = vector[j]; // Almacena temporalmente el valor del elemento actual.
                    vector[j] = vector[j + 1]; // Asigna el valor del siguiente elemento al actual.
                    vector[j + 1] = temp; // Asigna el valor almacenado temporalmente al siguiente elemento.
                }
            }
        }
    }

    // Algoritmo QuickSort enfoque "divide y vencerás".
    public static void quickSort(int[] vector, int inicio, int fin) {
        if (inicio < fin) { // Comprueba si la porción del arreglo contiene más de un elemento.
            int indicePivote = particion(vector, inicio, fin);// Encuentra el índice del pivote después de la partición.
            quickSort(vector, inicio, indicePivote - 1); // Llama recursivamente a QuickSort para la sublista a la
                                                         // izquierda del pivote.
            quickSort(vector, indicePivote + 1, fin);// Llama recursivamente a QuickSort para la sublista a la derecha
                                                     // del pivote.
        }
    }

    // Método auxiliar para realizar la partición del arreglo.
    // Divide el arreglo en dos partes con respecto al pivote: elementos menores y
    // mayores o iguales al pivote.
    public static int particion(int[] vector, int inicio, int fin) {
        int pivote = vector[fin]; // Selecciona el último elemento del segmento como pivote.
        int i = inicio - 1; // Inicializa el índice del límite entre elementos menores y mayores al pivote.

        // Recorre el segmento desde "inicio" hasta "fin - 1".
        for (int j = inicio; j < fin; j++) {
            if (vector[j] <= pivote) { // Si el elemento actual es menor o igual al pivote:
                i++; // Incrementa el índice del límite.
                // Intercambio
                int temp = vector[i];
                vector[i] = vector[j];// Intercambia el elemento actual con el elemento en la posición del límite.
                vector[j] = temp;
            }
        }

        // Coloca el pivote en su posición correcta dentro del arreglo.
        // Intercambia el pivote con el primer elemento mayor al pivote.
        int temp = vector[i + 1];
        vector[i + 1] = vector[fin];
        vector[fin] = temp;

        return i + 1;// Devuelve el índice donde se colocó el pivote.
    }

    // Método ShellSort
    public static void ShellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    // Método Radix Sort
    public static void Radix(int[] arr) {
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    // Obtener el máximo valor del arreglo
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // Método de conteo para Radix Sort
    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Método para ordenar usando Intercalación
    public static void intercalación() {

        // Dos arreglos ordenados para intercalar
        int[] arreglo1 = { 6, 18, 50 };
        int[] arreglo2 = { 8, 22, 38, 94, 100 };

        // Arreglo resultado para almacenar la intercalación
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        // Índices para recorrer los arreglos
        int i = 0, j = 0, k = 0;

        // Intercalar elementos mientras haya elementos en ambos arreglos
        while (i < arreglo1.length && j < arreglo2.length) {
            if (arreglo1[i] <= arreglo2[j]) {
                resultado[k++] = arreglo1[i++];
            } else {
                resultado[k++] = arreglo2[j++];
            }
        }

        // Copiar los elementos restantes de arreglo1 si quedan
        while (i < arreglo1.length) {
            resultado[k++] = arreglo1[i++];
        }

        // Copiar los elementos restantes de arreglo2 si quedan
        while (j < arreglo2.length) {
            resultado[k++] = arreglo2[j++];
        }

        // Mostrar el resultado de la intercalación
        System.out.println("Resultado de la intercalación:");
        for (int elemento : resultado) {
            System.out.print(elemento + " ");
        }
        System.out.println(); // Salto de línea al final

    }

    // Método para ordenar usando Mezcla Directa (MergeSort)
    public static void Mezcla_Directa() {
        // Arreglo a ordenar
        int[] elementos = { 38, 18, 50, 8, 6, 100, 94, 90, 22, 10 };

        // Llamada al método de ordenación MergeSort
        mergeSort(elementos, 0, elementos.length - 1);

        // Mostrar el resultado del ordenamiento
        System.out.println("Resultado de la Mezcla Directa:");
        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println(); // Salto de línea
    }

    // Método principal de MergeSort
    private static void mergeSort(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            // Dividir el arreglo a la mitad
            int medio = (izquierda + derecha) / 2;

            // Ordenar recursivamente las dos mitades
            mergeSort(array, izquierda, medio);
            mergeSort(array, medio + 1, derecha);

            // Combinar las mitades ordenadas
            merge(array, izquierda, medio, derecha);
        }
    }

    // Método para combinar dos mitades ordenadas
    private static void merge(int[] array, int izquierda, int medio, int derecha) {
        // Tamaños de los subarreglos
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        // Crear subarreglos temporales
        int[] izquierdaArray = new int[n1];
        int[] derechaArray = new int[n2];

        // Copiar datos a los subarreglos
        for (int i = 0; i < n1; i++) {
            izquierdaArray[i] = array[izquierda + i];
        }
        for (int j = 0; j < n2; j++) {
            derechaArray[j] = array[medio + 1 + j];
        }

        // Índices iniciales para recorrer los subarreglos y el arreglo original
        int i = 0, j = 0, k = izquierda;

        // Combinar los subarreglos
        while (i < n1 && j < n2) {
            if (izquierdaArray[i] <= derechaArray[j]) {
                array[k] = izquierdaArray[i];
                i++;
            } else {
                array[k] = derechaArray[j];
                j++;
            }
            k++;
        }

        // Copiar elementos restantes de izquierdaArray
        while (i < n1) {
            array[k] = izquierdaArray[i];
            i++;
            k++;
        }

        // Copiar elementos restantes de derechaArray
        while (j < n2) {
            array[k] = derechaArray[j];
            j++;
            k++;
        }
    }

    // Método para ordenar usando Mezcla Natural
    public static void Mezcla_Natural() {
        // Arreglo a ordenar
        int[] elementos = { 38, 18, 50, 8, 6, 100, 94, 90, 22, 10 };

        // Llamar al método de mezcla natural
        mezclaNatural(elementos);

        // Mostrar el resultado del ordenamiento
        System.out.println("Resultado de la Mezcla Natural:");
        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println(); // Salto de línea
    }

    private static void mezclaNatural(int[] array) {
        boolean ordenado;

        // Iterar hasta que todo el arreglo esté completamente ordenado
        do {
            ordenado = true;

            // Encontrar subsecuencias ordenadas y mezclarlas
            int inicio = 0;

            while (inicio < array.length) {
                // Encontrar el final de la primera subsecuencia ordenada
                int medio = inicio;
                while (medio < array.length - 1 && array[medio] <= array[medio + 1]) {
                    medio++;
                }

                // Si no hay más subsecuencias, salir del bucle
                if (medio == array.length - 1) {
                    break;
                }

                // Encontrar el final de la segunda subsecuencia ordenada
                int fin = medio + 1;
                while (fin < array.length - 1 && array[fin] <= array[fin + 1]) {
                    fin++;
                }

                // Mezclar las dos subsecuencias
                merge(array, inicio, medio, fin);

                // Mover el inicio a la siguiente subsecuencia
                inicio = fin + 1;

                // Marcar como no completamente ordenado
                ordenado = false;
            }
        } while (!ordenado);
    }

    // Método de combinación (igual al usado en MergeSort)
    private static void merge(int[] array, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] izquierdaArray = new int[n1];
        int[] derechaArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            izquierdaArray[i] = array[izquierda + i];
        }
        for (int j = 0; j < n2; j++) {
            derechaArray[j] = array[medio + 1 + j];
        }

        int i = 0, j = 0, k = izquierda;

        while (i < n1 && j < n2) {
            if (izquierdaArray[i] <= derechaArray[j]) {
                array[k] = izquierdaArray[i];
                i++;
            } else {
                array[k] = derechaArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = izquierdaArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = derechaArray[j];
            j++;
            k++;
        }
    }
}