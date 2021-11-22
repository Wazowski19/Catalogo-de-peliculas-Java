
package mx.com.gm.peliculas.servicio;



public interface ICatalogoPeliculas {
    String NOMBRE_RECURSO = "peliculas.txt";
    
    public void agregarPeliculas(String nombrePelicula);
    
    public void listarPeliculas();
    
    public void buscarPelicula(String buscar);
    
    public void iniciarCatalogoPeliculas();
}
