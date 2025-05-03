//  CRUD

// Create  Read  Update  Delete
import java.io.IOException;
//Importar una libería de entrada-Salida
//import java.io.*;

//Importar una libreria de funciones para trabajar con archivos CRUD
import java.nio.file.*;
//import java.util.ArrayList;
//import java.util.List;
//Librería palabras reservadas de JAVA
import java.util.*;

//Crear una clase del Archivo
public class TextFileCRUD { // Dirección y nombre del archivo
    private static final String FILE_PATH = "C:/itsao/ESTRUCTURA DE DATOS/programas/archivos/";
    private static final String NAME_FILE = "prueba.txt";

    // CREATE Creación del archivo
    public static void createFile() throws IOException {
        Path path = Paths.get(FILE_PATH + NAME_FILE);
        if (!Files.exists(path)) {// si NO EXISTE
            Files.createFile(path);
            System.out.println("Archivo creado exitosamente.");
        } else {
            System.out.println("El archivo ya existe.");
        }
    }

    // READLeer Archivo
    public static void readFile() throws IOException {
        Path path = Paths.get(FILE_PATH + NAME_FILE);
        if (Files.exists(path)) { // almacena las líneas del texto en una LISTA
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(path));
            if (lines.isEmpty()) {
                System.out.println("El archivo está vacío.");
            } else {// Lee cada de unas líneas
                for (String line : lines) {// de line = 0, hasta lines (índices almacenados en la LISTA)
                    System.out.println(line);
                }
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    // UPPDATE Modificar-Actualizar archivo
    public static void updateFile(int parrafo, String newLine) throws IOException {
        // Sobreescribir texto en el archivo, si no contiene NADA agregar texto nuevo
        // Si contiene texto agregar uno nuevo
        Path path = Paths.get(FILE_PATH + NAME_FILE);
        if (Files.exists(path)) {
            List<String> lines = new ArrayList<>(Files.readAllLines(path));
            if (lines.size() >= parrafo && parrafo > 0) {// Copiar información de manera temporal
                lines.set(parrafo - 1, newLine);
                Files.write(path, lines);// SOBREESCRIBE
                System.out.println("Línea actualizada correctamente.");
            } else {
                lines.add(newLine);
                Files.write(path, lines);
                System.out.println("Línea agregada al final del archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    // DELETE elimina todo el contenido del archivo
    public static void deleteFromFile(int parrafo) throws IOException {
        // eliminar el texto del archivo ubicado en PATH
        Path path = Paths.get(FILE_PATH + NAME_FILE);
        if (Files.exists(path)) {
            List<String> lines = new ArrayList<>(Files.readAllLines(path));
            if (lines.size() >= parrafo && parrafo > 0) {// copia temporalmente todo el texto
                lines.remove(parrafo - 1); // elimina una a una las líneas de texto
                Files.write(path, lines);
                System.out.println("Línea eliminada correctamente.");
            } else {
                System.out.println("El número de línea no es válido.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    // DELETE borrando todo el ARCHIVO COMPLETO
    public static void deleteFile() throws IOException {
        Path path = Paths.get(FILE_PATH + NAME_FILE);
        if (Files.exists(path)) {
            Files.delete(path);
            System.out.println("Archivo eliminado exitosamente.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n *-*-*- Menú -*-*-*");
            System.out.println("1. Crear archivo");
            System.out.println("2. Leer archivo");
            System.out.println("3. Modificar archivo");
            System.out.println("4. Eliminar línea del archivo");
            System.out.println("5. Eliminar archivo completo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            option = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (option) {
                    case 1:
                        createFile();
                        break;
                    case 2:
                        readFile();
                        break;
                    case 3:
                        System.out.print("Ingrese el número de línea a modificar (0 para agregar al final): ");
                        int lineToModify = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        System.out.print("Ingrese el nuevo texto: ");
                        String newLine = scanner.nextLine();// almacena la inforación del usuario
                        updateFile(lineToModify, newLine);// envía los parámetros a la función updatefile y reemplaza la
                                                          // información
                        break;
                    case 4:
                        // dejar el archivo en blanco, listo para llenarse con otro texto
                        System.out.print("Ingrese el número de línea a eliminar: ");
                        int lineToDelete = scanner.nextInt();
                        deleteFromFile(lineToDelete);
                        break;
                    case 5:
                        System.out.print("¿Está seguro de que desea eliminar el archivo? (S/N): ");
                        String confirm = scanner.nextLine().trim().toLowerCase();
                        if (confirm.equals("s")) {
                            deleteFile();
                        } else {
                            System.out.println("El archivo no fue eliminado.");
                        }
                        break;
                    case 6:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error al procesar el archivo: " + e.getMessage());
            }
        } while (option != 6);

        scanner.close();
    }
}
