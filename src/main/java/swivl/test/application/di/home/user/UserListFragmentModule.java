package swivl.test.application.di.home.user;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import swivl.test.application.app.home.UserListFragment;
import swivl.test.application.app.home.adapter.UserRecyclerAdapter;
import swivl.test.application.viewmodel.UserListFragmentViewModel;

@Module
public class UserListFragmentModule {

    @Provides
    UserListFragmentViewModel provideViewModel(UserListFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(UserListFragmentViewModel.class);
    }

    @Provides
    UserRecyclerAdapter provideUserAdapter(UserRecyclerAdapter.UserItemListListener listener) {
        return new UserRecyclerAdapter(listener);
    }

    @Provides
    UserRecyclerAdapter.UserItemListListener provideUserListListener(UserListFragment fragment) {
        return fragment;
    }
}
