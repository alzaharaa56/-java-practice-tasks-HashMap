import java.util.HashMap;

public class MovieDirectorDemo {
    public static void main(String[] args) {

        HashMap<String, String> movieDirectors = new HashMap<>();

        movieDirectors.put("Inception", "Christopher Nolan");
        movieDirectors.put("Pulp Fiction", "Quentin Tarantino");
        movieDirectors.put("The Lion King", "Roger Allers");
        movieDirectors.put("Parasite", "Bong Joon-ho");
        movieDirectors.put("Spirited Away", "Hayao Miyazaki");

        System.out.println("All Movie Records: " + movieDirectors);

        System.out.println("Director of Inception: " + movieDirectors.get("Inception"));

        System.out.println("Is 'Parasite' in the list? " + movieDirectors.containsKey("Parasite"));

        movieDirectors.put("The Lion King", "Jon Favreau");
        System.out.println("Updated Movie List: " + movieDirectors);

        movieDirectors.remove("Pulp Fiction");
        System.out.println("After removing Pulp Fiction: " + movieDirectors);

        System.out.println("Total movies: " + movieDirectors.size());
    }
}
