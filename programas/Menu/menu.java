import java.util.ArrayList;//Libería para trabajar con Listas y Arreglos
import java.util.Scanner;

public class menu{
    //Declaración del arrayList en memoria 
    // Propiedades del objeto
    ArrayList<Double> ListaNumeros;

    public static void main(String[] args) {
    //Asignamos una INSTANCIA(objeto) en la CLASE
    menu miLista = new menu();//Se llama a la clase(plantilla Menú) principal
 
    //Declarando la ArrayList
    miLista.ListaNumeros = new ArrayList<>();

    //Lamar método para leer la opción del usuario  
    miLista.leerOpcion();
    }

    public void leerOpcion() {
        //Leer el número de opción que elija el usuario
        //Declaración de variable OPCION
        Scanner teclado = new Scanner(System.in);
        
        int opcion;//Declarando la variable para almacenar la opcion
        
        do{
            //Desplegar el menú
            System.out.println("* * * *  MENÚ  * * *");
            System.out.println("[1] Agregar");
            System.out.println("[2] Modificar");
            System.out.println("[3] Eliminar");
            System.out.println("[4] Insertar");
            System.out.println("[5] Buscar elemento");
            System.out.println("[6] Mostrar elemento");
            System.out.println("[7] Salir");
            System.out.println("Elige una opción:");
            opcion = teclado.nextInt();

            //LLAMADO A LAS FUNCIONES
            //ciclo Switch
            switch (opcion) {
                case 1://AGREGAR
                        AgregarElemento();
                    break;
                case 2://Modificar
                        ModificarElemento();
                    break;
                case 3://Eliminar
                        BorrarElemento();
                    break;
                case 4://Insertar
                        InsertarElemento();
                    break;
                case 5://buscar
                        BuscarElemento();
                    break;
                case 6://Mostrar elemento
                        MostrarElemento();    
                break;
                case 7://SALIDA
                    System.out.println("Fin del programa");
                    break;
                 //default:
                  //  break;
            }
        }while(opcion!=7);//condicion

        
        System.out.println("Datos Originales");
        //mostrar el array completo
        
        teclado.close();
    }//faltó cerrar

        public void AgregarElemento(){//Agregando datos nuevos
           System.out.println("Función de Agregar Elemento");
           //Pedir el número al usuario (espacio en memoriaa)
            Scanner teclado = new Scanner(System.in);
            double valor; //cajita del valor del elemento
            //mostrar el array completo

            System.out.println("Dame el elemento a ingresar");
            valor = teclado.nextDouble();
            //llamando al método Agregar;
            ListaNumeros.add(valor);

            //mostrar el array completo con el elemento agregado
        }
         
        public void ModificarElemento(){//Modificar el valor del dato de acuerdo a su índice
            System.out.println("Función de Modificar Elemento");
            Scanner teclado = new Scanner(System.in);
            int indice; //Valor del índice
            double valor_nuevo;

            //mostrar el array completo 
            System.out.println("Dame el indice");
            indice = teclado.nextInt();
            System.out.println("Dame el valor nuevo");
            valor_nuevo = teclado.nextDouble();
            //modificar el valor
            ListaNumeros.add(indice,valor_nuevo);
            //mostrar el array completo modificado
        }
       
        public void BorrarElemento(){//Equipo 1  Borrar el dato de acuerdo a su índice
            System.out.println("Función de Borrar Elemento");
            //System.out.println("Funcion Eliminar elemento");
            Scanner teclado = new Scanner(System.in);
            int indice; //Valor del indice
            double valor_Borrar;
            System.out.println("Dame el indice para borrar");
            indice = teclado.nextInt();
            valor_Borrar = teclado.nextInt();
            //Borrar el valor
            ListaNumeros.remove(valor_Borrar);     
            //mostrar el array completo    
        }
        public void InsertarElemento(){//Equipo 2 mostrar por indice
            System.out.println("Función de Insertar Elemento");
            //mostrar por indice
            //mostrar el array completo 

            System.out.println("Funcion de insertar elemento");
            Scanner teclado = new Scanner(System.in);
            int indice; //Valor del indice
            double nuevo_elemento;
            System.err.println("Dame un elemento");
            indice = teclado.nextInt();
            //Mostrar elemento
            System.out.println("Se encuentra en el indice: ");
            nuevo_elemento = teclado.nextDouble(); 
            ListaNumeros.get(nuevo_elemento);      
            //mostrar el array completo con el elemento nuevo 
        }
        
        public void BuscarElemento(){ //Equipo 3 mostrar por valor
            System.out.println("Función de Buscar Elemento");
        
            Scanner teclado = new Scanner(System.in);
    
            System.out.println("DAME EL VALOR A BUSCAR");
            double valor = teclado.nextDouble();
            //mostrar el array completo
            if (ListaNumeros.contains(valor)) {
                int indice = ListaNumeros.indexOf(valor);
                System.out.println("VALOR ENCONTRADO EN EL  ÍNDICE: " + indice);
            } else {
                System.out.println("VALOR NO ENCONTRADO EN LA LISTA");
            }
            //mostrar el array completo con el elemento nuevo 

    
        } 
    
        public void MostrarElemento(){//Equipo 4 todos
            System.out.println("Función de Mostrar Elemento");
            
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dame el índice");
            int indice = teclado.nextInt();
            
            // Verificar si el índice está dentro del rango válido
            if (indice >= 0 && indice < ListaNumeros.size()) {
                System.out.println("El valor en el índice " + indice + " es: " + ListaNumeros.get(indice));
            } else {
                System.out.println("No se encuentra en el índice");
            }
    
        }
    
}
