public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screenmatch!");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);
        //first comment in case we´ll need to fix something later

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
/* This is a multiline comment that needs to close
after lines.
 */
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);



    }
}