import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Cast cast = new Cast("Sam Wothigton", "Jake Sally");
            Cast cast2 = new Cast("Zoe Saldana", "Naytiry");
            Cast cast3 = new Cast("Kate Winslet", "Ronal");
            Cast cast4 = new Cast("Stephon Lang", "Quarcitch");
            Director director = new Director("James", "Cameron");
            Cast[] casts = {cast, cast2, cast3, cast4};
            Movie movie = new Movie("Avatar "
                    , 2022, "Fantasy", director, casts);
            Cast cast5 = new Cast("Tom Hanks ", "Poul Edgecomb");
            Cast cast6 = new Cast("David Morse", "Brutus'brutal'Howell");
            Cast cast7 = new Cast("Michel Klark Dungan", "John Coffey");
            Cast[] casts1 = {cast5, cast6, cast7};
            Director director1 = new Director("Frank ", "Darobant");
            Movie movie1 = new Movie("The green mile", 1999, "Drama", director1, casts1);
            Movie[] movies = {movie, movie1};
            Scanner scanner = new Scanner(System.in);
            System.out.println(" 1.void getAllMovies\n" +
                    "  2. findMovieByName\n" +
                    "  3. findMovieByActorName\n" +
                    "  4. findMovieByYear\n" +
                    "  5. findMovieByDirector\n" +
                    "  6. findMovieByDescription\n" +
                    "  7. findMovieByRole\n");
        System.out.println("\n WRITE THERE :");
            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    movie.getAllMovies(movies);
                    break;
                case 2:
                    movie.findMovieByName(movies);
                    break;
                case 3:
                    movie.findMovieByActorName(movies);
                    break;
                case 4:
                    movie.findMovieByYear(movies);
                    break;
                case 5:
                    movie.findMovieByDirector(movies);
                    break;
                case 6:
                    movie.findMovieByDescription(movies);
                    break;
                case 7:
                    movie.findMovieByRole(movies);
                    break;
                default:
                    System.out.println("ERROR");
            }

        }

    }

