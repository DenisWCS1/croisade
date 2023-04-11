public class Croisade {
    // static indique que la variable appartient à la class plutot qu'a une instance
    // de la classe
    static String movieName = "Indiana Jones et la dernière croisade";
    boolean viewMovie = true;
    int movieYear = 1989;
    float movieRate = 8 / 2;

    public static void main(String[] args) {
        // methode en utilisant static
        System.out.println("Movie Name: " + movieName);

        // autre methode croisade de type fort Croisade création d'une nouvelle instance
        Croisade croisade = new Croisade();

        // appel de l'instance croisade
        System.out.println("View Movie: " + croisade.viewMovie);
        System.out.println("Movie Year: " + croisade.movieYear);
        System.out.println("Movie Rate: " + croisade.movieRate);
    }
}