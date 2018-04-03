package ch.jamesgri.moviesnew.data.remote;

/**
 * Created by jamesrichardson on 02/04/2018.
 */

public class ApiUtils {
    public static final String BASE_URL = "http://api.themoviedb.org/3/";

    public static MovieService getMovieService() {
        return RetrofitClient.getClient(BASE_URL).create(MovieService.class);
    }
}
