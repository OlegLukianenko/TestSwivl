package swivl.test.application.di.home.user;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import swivl.test.application.app.home.UserListFragment;

@Subcomponent(modules = UserListFragmentModule.class)
public interface UserListFragmentComponent extends AndroidInjector<UserListFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserListFragment> {}
}

