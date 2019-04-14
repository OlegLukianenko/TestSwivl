package swivl.test.application.di.viewmodel;

import dagger.Subcomponent;
import swivl.test.application.viewmodel.UserListFragmentViewModel;
import swivl.test.application.viewmodel.ProfileFragmentViewModel;
import swivl.test.application.viewmodel.SplashActivityViewModel;

@Subcomponent
public interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelComponent build();
    }

    SplashActivityViewModel splashActivityViewModel();

    UserListFragmentViewModel userFragmentViewModel();

    ProfileFragmentViewModel profileFragmentViewModel();
}
