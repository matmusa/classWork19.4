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
        for (Movie m : movies
        ) {

            System.out.println("WRITE A NAME OF MOVIE: ");
            String name = new Scanner(System.in).nextLine();
            if (m.name.equals(name)) {
                System.out.println(m.toString());
            }

        }
    }


    @Override
    public void findMovieByActorName(Movie[] movies) {
        for (Movie m : movies
        ) {

            System.out.println("WRITE A ACTOR NAME  : ");
            String name = new Scanner(System.in).nextLine();
            for (Cast c : casts
            ) {
                if (c.getActorFullName().equals(name.toUpperCase(Locale.ROOT)))
                    System.out.println(m.toString());
            }


        }

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
        for (Movie m : movies
        ) {

            System.out.println("WRITE A NAME OF DIRECTOR : ");
            String name = new Scanner(System.in).nextLine();
            if (director.getName().equals(name)) {
                System.out.println(m.toString());
            }

        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {

        for (Movie m : movies
        ) {

            System.out.println("WRITE A DISCRIPTION OF MOVIE  : ");
            String name = new Scanner(System.in).nextLine();
            if (m.getDescription().equals(name)) {
                System.out.println(m.toString());
            }

        }
    }

    @Override
    public void findMovieByRole(Movie[] movies) {

        for (Movie m : movies
        ) {

            System.out.println("WRITE A NAME OF ROLE : ");
            String name = new Scanner(System.in).nextLine();
            for (Cast c : casts
            ) {
                if (c.getRole().equals(name))
                    System.out.println(m.toString());
            }

        }
    }
}
