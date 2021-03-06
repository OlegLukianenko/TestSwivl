package swivl.test.application.di.app;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import swivl.test.application.app.App;
import swivl.test.application.di.home.mainActivity.MainActivityComponent;
import swivl.test.application.di.splash.SplashActivityComponent;
import swivl.test.application.di.viewmodel.ViewModelComponent;
import swivl.test.application.di.viewmodel.ViewModelFactory;
import swivl.test.application.utils.NetworkHelper;

@Module(subcomponents = {
        ViewModelComponent.class,
        SplashActivityComponent.class,
        MainActivityComponent.class})
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(App app) {
        return app;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(App app) {
        return app.getSharedPreferences("THIS_APP_SP", Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    ViewModelProvider.Factory provideViewModelFactory(ViewModelComponent.Builder component) {
        return new ViewModelFactory(component.build());
    }

    @Provides
    @Singleton
    NetworkHelper provideNetworkHelper(App app) {
        return new NetworkHelper(app);
    }
}
