package swivl.test.application.di;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import swivl.test.application.app.home.ProfileFragment;
import swivl.test.application.app.home.UserListFragment;
import swivl.test.application.di.home.profile.ProfileFragmentComponent;
import swivl.test.application.di.home.user.UserListFragmentComponent;

@Module
public abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(UserListFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindUserFragment(UserListFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ProfileFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindProfileFragment(ProfileFragmentComponent.Builder builder);

}


