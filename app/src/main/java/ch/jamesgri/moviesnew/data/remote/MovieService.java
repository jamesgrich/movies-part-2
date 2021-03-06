package ch.jamesgri.moviesnew.data.remote;

/**
 * Created by jamesrichardson on 21/03/2018.
 */

import ch.jamesgri.moviesnew.data.model.MovieVideo;
import ch.jamesgri.moviesnew.data.model.MoviesResponse;
import ch.jamesgri.moviesnew.data.model.MovieReview;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieService {

    // Calling the GET request for the API end points

    @GET("movie/{sort_by}")
    Call<MoviesResponse> getMovies(@Path("sort_by") String sortBy, @Query("api_key") String apiKey);

    // Calling the GET request for the video endpoint

    @GET("movie/{id}/video}")
    Call<MovieVideo> getVideos(@Path("id") String movieId, @Query("api_key") String apiKey);

    // Calling the GET request for the review endpoints

    @GET("movie/{id}/review")
    Call<MovieReview> getReviews(@Path("id") String movieId, @Query("api_key") String apiKey);

}
