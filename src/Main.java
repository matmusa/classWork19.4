import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cast cast = new Cast("Sam Wothigton", "Jake Sally");
        Cast cast2 = new Cast("Zoe Saldana", "Naytiry");
        Cast cast3 = new Cast("Kate Winslet", "Ronal");
        Cast cast4 = new Cast("Stephon Lang", "Quarcitch");
        Director director = new Director("James", "Cameron");
        List<Cast> casts = new ArrayList<>(List.of(cast, cast3, cast2, cast4));
        Movie movie = new Movie("Avatar", 2022, "Fantasy", director, casts);
        Cast cast5 = new Cast("Tom Hanks", "Poul Edgecomb");
        Cast cast6 = new Cast("David Morse", "Brutus'brutal'Howell");
        Cast cast7 = new Cast("Michel Klark Dungan", "John Coffey");
        List<Cast> casts1 = new ArrayList<>(List.of(cast5, cast6, cast7));
        Director director1 = new Director("Frank", "Darobant");
        Movie movie1 = new Movie("The green mile", 1999, "Drama", director1, casts1);
        List<Movie> movies = new ArrayList<>(List.of(movie1, movie));
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1.void getAllMovies\n" +
                "  2. findMovieByName\n" +
                "  3. findMovieByActorName\n" +
                "  4. findMovieByYear\n" +
                "  5. findMovieByDirector\n" +
                "  6. findMovieByDescription\n" +
                "  7. findMovieByRole\n" +
                "  8.sortByMovieName\n" +
                "  9.sortByYear\n ");
        System.out.println("\n WRITE THERE :");
        Findable findable=new FindableImpl();
        SortableImpl sortable=new SortableImpl();
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println(findable.getAllMovies(movies));
                break;
            case 2:
                findable.findMovieByName(movies);
                break;
            case 3:
                findable.findMovieByActorName(movies);
                break;
            case 4:
                findable.findMovieByYear(movies);
                break;
            case 5:
                findable.findMovieByDirector(movies);
                break;
            case 6:
                findable.findMovieByDescription(movies);
                break;
            case 7:
                findable.findMovieByRole(movies);
                break;
            case 8:
               sortable.sortByMovieName(movies);
                break;
            case 9:
             sortable.sortByYear(movies);
             break;
            default:
                System.out.println("ERROR");
        }

    }

}

