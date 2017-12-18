package dhruvam.olaapplication.network;

import dhruvam.olaapplication.model.SongListResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ritvik on 16-12-2017.
 */

public interface MyApiEndpointInterface {
    @GET(".")
    Call<SongListResponse> getSongList();

}
