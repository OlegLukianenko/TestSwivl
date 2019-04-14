package swivl.test.application.di.home.profile;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import swivl.test.application.app.home.ProfileFragment;

@Subcomponent(modules = ProfileFragmentModule.class)
public interface ProfileFragmentComponent extends AndroidInjector<ProfileFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileFragment> {}
}
