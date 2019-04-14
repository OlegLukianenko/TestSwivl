package swivl.test.application.app.home;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import swivl.test.application.R;
import swivl.test.application.base.BaseFragment;
import swivl.test.application.databinding.FragmentProfileBinding;
import swivl.test.application.di.viewmodel.Injectable;
import swivl.test.application.utils.NetworkHelper;
import swivl.test.application.viewmodel.ProfileFragmentViewModel;

public class ProfileFragment extends BaseFragment<FragmentProfileBinding> implements Injectable {

    @Inject
    ProfileFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    public static final int TIMEOUT_CODE = 408;

    @Override
    protected int getLayout() {
        return R.layout.fragment_profile;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        binding.setHandler(this);
        viewModel.getProgressBarEvent().postValue(true);

        Bundle bundle = this.getArguments();
        viewModel.sendProfileRequest(bundle.getString("login"));
        initSubscribers();
    }

    public void clickBackButton() {
        getActivity().onBackPressed();
    }

    public void openLink(String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(link));
        startActivity(intent);
    }


    private void initSubscribers() {
        viewModel.getProfileFromApi().observe(this, locationProfile -> {
            if (locationProfile.status) {
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (locationProfile.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(locationProfile.message, Toast.LENGTH_LONG);
                }
            }

        });

    }
}
