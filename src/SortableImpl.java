import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortableImpl implements Sortable {
    @Override
    public void sortByMovieName(List<Movie> movies) {
        Collections.sort(movies,Movie.SortbyNameFromZtoA);
        System.out.println(movies);
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        Collections.sort(movies,Movie.Ascending);
        System.out.println(movies);
    }
}
