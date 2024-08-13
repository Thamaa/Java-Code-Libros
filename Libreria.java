import java.io.*;

public class Libreria {
    public static void main(String[] args) throws IOException {
        int TAM = 30;
        int pLibre = 0;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        String[] codigos = new String[TAM];
        String[] titulos = new String[TAM];
        String[] autores = new String[TAM];
        int[] vecesPrestado = new int[5];

        int opcion;

        do {
            System.out.println("------------------------------------------");
            System.out.println("|                  MENÚ                  |");
            System.out.println("------------------------------------------");
            System.out.println("|  1.- Agregar libro                     |");
            System.out.println("|  2.- Buscar libro                      |");
            System.out.println("|  3.- Eliminar libro                    |");
            System.out.println("|  4.- Registrar libro como 'prestado'   |");
            System.out.println("|  5.- Salir                             |");
            System.out.println("------------------------------------------");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(lector.readLine());
            switch (opcion) {
                case 1:
                    int i = 0;
                    System.out.print("--------------------------\n");
                    System.out.println("|   Menu agregar libro   |");
                    System.out.print("--------------------------\n");
                    if (pLibre == 0) {
                        BufferedReader codigoAgregado = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader tituloAgregado = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader autorAgregado = new BufferedReader(new InputStreamReader(System.in));

                        System.out.println("Ingrese el codigo del libro :");
                        codigos[0] = codigoAgregado.readLine();

                        System.out.println("Ingrese el titulo del libro :");
                        titulos[0] = tituloAgregado.readLine();

                        System.out.println("Ingrese el autor de " + titulos[0] + ":");
                        autores[0] = autorAgregado.readLine();

                        vecesPrestado[0] = 0;

                        System.out.println("El titulo del libro agregado es : " + titulos[0]);
                        System.out.println("El autor es : " + autores[0]);
                        System.out.println("El Codigo del libro es : " + codigos[0]);
                        System.out.println("Se presto " + vecesPrestado[0] + "veces");

                        pLibre++;
                    }
                    else
                    {
                        while (i < pLibre)
                        {
                            i++;
                        }
                        BufferedReader codigoAgregado = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader tituloAgregado = new BufferedReader(new InputStreamReader(System.in));
                        BufferedReader autorAgregado = new BufferedReader(new InputStreamReader(System.in));

                        System.out.println("Ingrese el codigo del libro");
                        codigos[i] = codigoAgregado.readLine();

                        System.out.println("Porfavor ingrese el titulo del libro");
                        titulos[i] = tituloAgregado.readLine();

                        System.out.println("Excelente, ahora ingrese el autor de: " + titulos[i]);
                        autores[i] = autorAgregado.readLine();

                        vecesPrestado[i] = 0;

                        System.out.println("El titulo del libro agregado es : " + titulos[i]);
                        System.out.println("El autor es : " + autores[i]);
                        System.out.println("El Codigo del libro es : " + codigos[i]);
                        System.out.println("Se presto " + vecesPrestado[i] + " _veces");

                        pLibre++;
                    }
                    break;

                case 2://buscar
                    int j;
                    System.out.print("-------------------------\n");
                    System.out.print("|   Menu buscar libro   |\n");
                    System.out.print("-------------------------\n\n");
                    System.out.print("Ingrese el código del libro: ");
                    String codigoBusqueda = lector.readLine();

                    boolean encontrado = false;

                    for (j = 0 ; j < pLibre; j++)
                    {
                        if (codigos[j].equals(codigoBusqueda))
                        {
                            System.out.println("Libro encontrado:");
                            System.out.println("Código: " + codigos[j]);
                            System.out.println("Título: " + titulos[j]);
                            System.out.println("Autor: " + autores[j]);
                            System.out.println("Veces prestado: " + vecesPrestado[j]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("\nLibro no encontrado.");
                    }
                    break;

                case 3:
                    // Implementar eliminación
                    break;

                case 4:
                    // Prestamo
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
        System.out.println("Hasta luego!!!");
    }
}