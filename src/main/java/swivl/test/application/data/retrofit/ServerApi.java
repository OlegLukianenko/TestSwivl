package swivl.test.application.data.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import swivl.test.application.data.retrofit.response.Profile;
import swivl.test.application.data.retrofit.response.User;

public interface ServerApi {


    @GET("users/{id}")
    Call<Profile> getUserProfile(@Path("id") String id);

    @GET("users")
    Call<List<User>> getUserList();
}