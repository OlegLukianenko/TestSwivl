package swivl.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import swivl.test.application.data.retrofit.ResponseWrap;
import swivl.test.application.data.retrofit.response.Profile;
import swivl.test.application.data.retrofit.response.User;

public interface RepositoryApi {

     void getUserProfile(String login, MutableLiveData<ResponseWrap<Profile>> profileMutableLiveData);
     void getUserListFromApi (MutableLiveData<ResponseWrap<List<User>>> userMutableLiveData);
}
