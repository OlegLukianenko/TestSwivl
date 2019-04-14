package swivl.test.application.di.home.profile;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import swivl.test.application.app.home.ProfileFragment;
import swivl.test.application.viewmodel.ProfileFragmentViewModel;

@Module
public class ProfileFragmentModule {
    @Provides
    ProfileFragmentViewModel provideViewModel(ProfileFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(ProfileFragmentViewModel.class);
    }

}
