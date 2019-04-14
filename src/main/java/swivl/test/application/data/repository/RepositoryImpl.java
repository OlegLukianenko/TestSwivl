package swivl.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;
import android.text.TextUtils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

import javax.inject.Inject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import swivl.test.application.data.retrofit.APIError;
import swivl.test.application.data.retrofit.ResponseWrap;
import swivl.test.application.data.retrofit.ServerApi;
import swivl.test.application.data.retrofit.response.Profile;
import swivl.test.application.data.retrofit.response.User;

import static swivl.test.application.app.home.ProfileFragment.TIMEOUT_CODE;

public class RepositoryImpl implements RepositoryApi {

    @Inject
    ServerApi serverApi;

    @Inject
    protected Converter<ResponseBody, APIError> converter;
    private static final String UNKNOWN_ERROR = "Unknown error: ";

    @Inject
    public RepositoryImpl() {
    }

    @Override
    public void getUserProfile(String login, MutableLiveData<ResponseWrap<Profile>> profileMutableLiveData) {
        Call<Profile> messages = serverApi.getUserProfile(login);
        messages.enqueue(new Callback<Profile>() {
            @Override
            public void onResponse(Call<Profile> call, Response<Profile> response) {

                ResponseWrap<Profile> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                profileMutableLiveData.postValue(responseWrap);
            }

            @Override
            public void onFailure(Call<Profile> call, Throwable t) {
                ResponseWrap<Profile> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                profileMutableLiveData.postValue(responseWrap);
            }
        });
    }


    @Override
    public void getUserListFromApi(MutableLiveData<ResponseWrap<List<User>>> userMutableLiveData) {
        Call<List<User>> messages = serverApi.getUserList();
        messages.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                ResponseWrap<List<User>> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                userMutableLiveData.postValue(responseWrap);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                ResponseWrap<List<User>> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                userMutableLiveData.postValue(responseWrap);
            }
        });
    }


    private String getErrorMessage(Response<?> response) {
        String responseErrorMessage = null;

        try {
            APIError error = converter.convert(response.errorBody());
            if (!TextUtils.isEmpty(error.getMessage())) {
                responseErrorMessage = error.getMessage();
            }
        } catch (IOException e) {
            return UNKNOWN_ERROR + response.code();
        }

        return responseErrorMessage;
    }

}
