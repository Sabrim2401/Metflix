public class Pelicula extends Contenido {
    public int duracion; // en minutos
    public Director director;
    public boolean filmadaEnIMAX;  

public void reproducirPeli(){
    System.out.println("Reproduciendo pelicula " + nombre);
}
}