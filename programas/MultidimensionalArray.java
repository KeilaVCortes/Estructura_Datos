class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        String [][] matriz_ejemplo = {
                                     {"A1", "B2", "C3"}, 
                                     {"D4", "E5", "F6"}, 
                                     {"G7", "H8", "I9"}, 
                                     {"J10", "K11", "L12"}
        };
      
        // calculando la longitud de cada fila, o elementos que contiene cada fila
        System.out.println("Elementos de la fila 1: " + matriz_ejemplo[0].length);
        System.out.println("Elementos de la fila 2: " + matriz_ejemplo[1].length);
        System.out.println("Elementos de la fila 3: " + matriz_ejemplo[2].length);


        // Imprimiendo el número de columnas (que es igual al número de filas)
        System.out.println("Número de columnas: " + matriz_ejemplo.length);

        // Imprimiendo elementos
        for (int i = 0; i < matriz_ejemplo.length; ++i) {
            for (int j = 0; j < matriz_ejemplo[i].length; ++j) {
                System.out.println(matriz_ejemplo[i][j]);
            }
        }
    }
}

