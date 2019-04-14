package swivl.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import swivl.test.application.data.repository.RepositoryApi;
import swivl.test.application.data.retrofit.ResponseWrap;
import swivl.test.application.data.retrofit.response.Profile;

public class ProfileFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public ProfileFragmentViewModel() {
    }

    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();
    private MutableLiveData<ResponseWrap<Profile>> profileMutableLiveData = new MutableLiveData<>();

    public void sendProfileRequest(String login) {
        repositoryApi.getUserProfile(login ,profileMutableLiveData);
    }

    public MutableLiveData<ResponseWrap<Profile>> getProfileFromApi() {
        return profileMutableLiveData;
    }

    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }

}
