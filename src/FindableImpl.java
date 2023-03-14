import java.util.List;
import java.util.Scanner;

public class FindableImpl implements Findable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {

        return movies;


    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("WRITE A NAME OF MOVIE: ");
        String nameOfMovie = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies) {
            if (m.getName().toUpperCase().equals(nameOfMovie)) {
                System.out.println(m.toString());
            }
        }


    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("WRITE A NAME OF DIRECTOR : ");
        String nameOfDirector = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies
        ) {
            if (m.getDirector().getDirecctorName().toUpperCase().equals(nameOfDirector)
            ) {
                System.out.println(m.toString());

            }

        }

    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("WRITE A DISCRIPTION OF MOVIE  : ");
        String name = new Scanner(System.in).nextLine();
        for (Movie m : movies
        ) {


            if (m.getDescription().equals(name)) {
                System.out.println(m.toString());
            }

        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("WRITE A NAME OF ROLE : ");
        String roleName = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies
        )
            for (Cast c : m.getCasts()
            )
                if (c.getRole().toUpperCase().equals(roleName)) {
                    System.out.println(m.toString());

                }


    }


    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("WRITE A ACTOR NAME  : ");
        String name = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies
        )
            for (Cast c : m.getCasts()
            )
                if (c.getActorFullName().toUpperCase().equals(name))
                    System.out.println(m);

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        for (Movie m : movies
        ) {
            System.out.println("WRITE A YEAR OF MOVIE: ");
            int year = new Scanner(System.in).nextInt();
            if (m.getYear() == year) {
                System.out.println(m.toString());
            }

        }

    }
}
