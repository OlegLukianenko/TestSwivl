package swivl.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import swivl.test.application.R;
import swivl.test.application.app.home.adapter.UserRecyclerAdapter;
import swivl.test.application.base.BaseFragment;
import swivl.test.application.data.retrofit.response.User;
import swivl.test.application.databinding.FragmentUserBinding;
import swivl.test.application.di.viewmodel.Injectable;
import swivl.test.application.utils.NetworkHelper;
import swivl.test.application.viewmodel.UserListFragmentViewModel;

import static swivl.test.application.app.home.ProfileFragment.TIMEOUT_CODE;

public class UserListFragment extends BaseFragment<FragmentUserBinding> implements
        Injectable, UserRecyclerAdapter.UserItemListListener {

    @Inject
    UserListFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    UserRecyclerAdapter userRecyclerAdapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_user;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setHandler(this);
        binding.setLifecycleOwner(this);

        viewModel.sendUserRequest();
        viewModel.getProgressBarEvent().postValue(true);
        initSubscribers();
        initUserAdapter();

        binding.refreshView.setOnRefreshListener(() -> {
            viewModel.sendUserRequest();
            binding.refreshView.setRefreshing(false);
        });
    }

    private void initUserAdapter() {
        binding.recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recycleView.setAdapter(userRecyclerAdapter);
    }

    private void initSubscribers() {

        viewModel.getUserListResponseMutable().observe(this, userListResponseWrap ->
        {
            if (userListResponseWrap.status) {

                userRecyclerAdapter.setItems(userListResponseWrap.data);
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (userListResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(userListResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });
    }

    @Override
    public void onUserItemClick(User user) {
        if (getActivity() != null) {
            ProfileFragment profileFragment = new ProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putString("login", user.login);
            profileFragment.setArguments(bundle);
            ((MainActivity) getActivity()).showFragment(profileFragment);
        }
    }
}
