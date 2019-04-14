package swivl.test.application.di.splash;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import swivl.test.application.app.splash.SplashActivity;

@Subcomponent(modules = SplashModule.class)
public interface SplashActivityComponent extends AndroidInjector<SplashActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashActivity> {}

}


