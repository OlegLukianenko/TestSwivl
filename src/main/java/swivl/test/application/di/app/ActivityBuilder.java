package swivl.test.application.di.app;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import swivl.test.application.app.home.MainActivity;
import swivl.test.application.app.splash.SplashActivity;
import swivl.test.application.di.home.mainActivity.MainActivityComponent;
import swivl.test.application.di.splash.SplashActivityComponent;

@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(SplashActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSplashActivity(SplashActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

}