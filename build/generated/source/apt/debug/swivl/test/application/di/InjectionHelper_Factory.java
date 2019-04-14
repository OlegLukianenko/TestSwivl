// Generated by Dagger (https://google.github.io/dagger).
package swivl.test.application.di;

import dagger.internal.Factory;
import javax.inject.Provider;
import swivl.test.application.app.App;

public final class InjectionHelper_Factory implements Factory<InjectionHelper> {
  private final Provider<App> appProvider;

  public InjectionHelper_Factory(Provider<App> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public InjectionHelper get() {
    return provideInstance(appProvider);
  }

  public static InjectionHelper provideInstance(Provider<App> appProvider) {
    return new InjectionHelper(appProvider.get());
  }

  public static InjectionHelper_Factory create(Provider<App> appProvider) {
    return new InjectionHelper_Factory(appProvider);
  }

  public static InjectionHelper newInjectionHelper(App app) {
    return new InjectionHelper(app);
  }
}
