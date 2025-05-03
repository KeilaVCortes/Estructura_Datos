import java.util.Scanner;

public class add_element {
public static void main(String[] args) {
    int[] posiciones={00,50,70,80,20,60,30,40,90};
    Scanner scanner = new Scanner(System.in);

    System.out.println("Dame los elementos a agregrar:");
    int elementos = scanner.nextInt();
	//Creando un vector con los nuevos elementos
	    int[] nuevoVector = new int[posiciones.length + elementos];

        //agregar el vector posiciones al NewArray
        for(int i=0; i<=posiciones.length ; i++){ //Leyendo los indices del vector posiciones
        //anadir elementos del vector POSICIONES a nuevoVector
	        nuevoVector[i]= posiciones[i];     
        }
            
        for(int j=posiciones.length; j<=nuevoVector.length ; j++){
            //Guardando elementos en la variable nuevosNumeros
            System.out.println("Dame el valor del elemento"); 
            nuevoVector[j] = scanner.nextInt();
        }
            
        // Muestra el vector final
        System.out.println("El nuevo vector es:");
        for (int j = 0; j < nuevoVector.length; j++) {
            System.out.print(nuevoVector[j] + " ");
        }
        
        scanner.close();
}
}
