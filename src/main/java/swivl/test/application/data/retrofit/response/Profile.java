package swivl.test.application.data.retrofit.response;

import com.google.gson.annotations.SerializedName;

public class Profile {

    public String name;

    @SerializedName("public_repos")
    public String publicRepos;

    @SerializedName("public_gists")
    public String publicGists;

    public String followers;

    @SerializedName("avatar_url")
    public String avatarUrl;

    @SerializedName("html_url")
    public String htmlUrl;

}
