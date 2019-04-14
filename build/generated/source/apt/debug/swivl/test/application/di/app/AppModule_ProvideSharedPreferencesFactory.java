// Generated by Dagger (https://google.github.io/dagger).
package swivl.test.application.di.app;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import swivl.test.application.app.App;

public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<App> appProvider;

  public AppModule_ProvideSharedPreferencesFactory(AppModule module, Provider<App> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideInstance(module, appProvider);
  }

  public static SharedPreferences provideInstance(AppModule module, Provider<App> appProvider) {
    return proxyProvideSharedPreferences(module, appProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(
      AppModule module, Provider<App> appProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(module, appProvider);
  }

  public static SharedPreferences proxyProvideSharedPreferences(AppModule instance, App app) {
    return Preconditions.checkNotNull(
        instance.provideSharedPreferences(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
