package swivl.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import swivl.test.application.data.repository.RepositoryApi;
import swivl.test.application.data.retrofit.ResponseWrap;
import swivl.test.application.data.retrofit.response.User;


public class UserListFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public UserListFragmentViewModel() {
    }

    private MutableLiveData<ResponseWrap<List<User>>> userListMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();

    private MutableLiveData<Boolean> fragmentVisibility = new MutableLiveData<>();


    public void sendUserRequest() {
        repositoryApi.getUserListFromApi(userListMutableLiveData);
    }

    public MutableLiveData<ResponseWrap<List<User>>> getUserListResponseMutable() {
        return userListMutableLiveData;
    }


    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }

    public MutableLiveData<Boolean> getFragmentEvent() {
        return fragmentVisibility;
    }

}
