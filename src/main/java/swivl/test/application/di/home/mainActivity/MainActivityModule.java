package swivl.test.application.di.home.mainActivity;

import dagger.Module;
import swivl.test.application.di.home.profile.ProfileFragmentComponent;
import swivl.test.application.di.home.user.UserListFragmentComponent;

@Module (subcomponents = {
        UserListFragmentComponent.class,
        ProfileFragmentComponent.class})
public class MainActivityModule {

}
