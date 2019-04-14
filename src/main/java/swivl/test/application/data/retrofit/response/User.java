package swivl.test.application.data.retrofit.response;

import com.google.gson.annotations.SerializedName;

public class User {

    public String login;

    @SerializedName("avatar_url")
    public String avatarUrl;

}
