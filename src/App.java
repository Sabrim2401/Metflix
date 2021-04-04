

public class App {
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        //How I met your mother y 
        //reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        Serie serieBuscada = miMetflix.buscarSerie("How I met your mother");

        Temporada temporada = serieBuscada.buscarTemporada(5);

        Episodio episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();

        // creado por Sabri <3

        miMetflix = new Metflix();

        System.out.println("Inicializando por segunda vez el catalogo de Metflix");

        miMetflix.inicializarCatalogo();

        serieBuscada = miMetflix.buscarSerie("New Amsterdam");

        temporada = serieBuscada.buscarTemporada(1);

        episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();

        //creado por chabri
        
        miMetflix =new Metflix();

        System.out.println("Inicializando por tercera vez el catalogo de Metflix");

        miMetflix.inicializarCatalogo();

        serieBuscada = miMetflix.buscarSerie("Juego de Tronos");

        temporada = serieBuscada.buscarTemporada(2);

        episodio = temporada.buscarEpisodio(10);

        episodio.reproducir();

        //BUSCAR PELICULA

        miMetflix = new Metflix();

        System.out.println("Inicializando por primera vez el catalogo de Peliculas de Metflix");

        miMetflix.inicializarCatalogo();

        Pelicula pelicula = miMetflix.buscarPelicula("Titanic");

        pelicula.reproducirPeli();

        






    }
}
