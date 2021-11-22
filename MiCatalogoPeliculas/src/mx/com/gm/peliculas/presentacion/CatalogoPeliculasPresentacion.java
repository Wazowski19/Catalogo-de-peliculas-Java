package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.*;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var opcion = -1;
        ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("""
                           Elige opcion: 
                           1.-Iniciar catalogo peliculas
                           2.-Agregar pelicula
                           3.-Listar peliculas
                           4.-Buscar pelicula
                           0.-Salir\n""");
            opcion = Integer.parseInt(consola.nextLine());
            
            switch(opcion) {
                case 1:
                    catalogoPeliculas.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula a agregar:\n");
                    var nombrePelicula = consola.nextLine();
                    catalogoPeliculas.agregarPeliculas(nombrePelicula);
                    break;
                case 3:
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la pelicula a buscar: \n");
                    var buscar = consola.nextLine();
                    catalogoPeliculas.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
            String nombreArchivo = "C:\\Users\\magar\\OneDrive\\Documentos\\Cursos Udemy\\Universidad Java 2021 - De Cero a Experto! +100 hrs\\Sección 42 Programación con Java Laboratorio Final y Conclusión del Curso\\156. Laboratorio Proyecto Final Curso de Programación con Java\\MiCatalogoPeliculas\\Peliculas.txt";

        }

    }

}
