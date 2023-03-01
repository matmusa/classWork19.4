import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Movie implements Findable {


    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast[] casts;

    public Movie(String name, int year, String description, Director director, Cast[] casts) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.casts = casts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Cast[] getCasts() {
        return casts;
    }

    public void setCasts(Cast[] casts) {
        this.casts = casts;
    }

    @Override
    public String toString() {
        return "\nMovie  :" +
                "\nname : " + name +
                "\n year :" + year +
                "\n description :" + description +
                "\ndirector :" + director +
                "\ncasts :" + Arrays.toString(casts)
                ;
    }

    @Override
    public void getAllMovies(Movie[] movies) {
        for (Movie m : movies
        ) {
            System.out.println(m.toString());

        }
    }

    @Override
    public void findMovieByName(Movie[] movies) {
        System.out.println("WRITE A NAME OF MOVIE: ");
        String nameOfMovie = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies) {
            if (m.getName().toUpperCase().equals(nameOfMovie)) {
                System.out.println(m.toString());
            }

        }
    }


    @Override
    public void findMovieByActorName(Movie[] movies) {
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
    public void findMovieByYear(Movie[] movies) {
        for (Movie m : movies
        ) {
            System.out.println("WRITE A YEAR OF MOVIE: ");
            int year = new Scanner(System.in).nextInt();
            if (m.getYear() == year) {
                System.out.println(m.toString());
            }


        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
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
    public void findMovieByDescription(Movie[] movies) {
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
    public void findMovieByRole(Movie[] movies) {
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
}



