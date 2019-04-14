// Generated by Dagger (https://google.github.io/dagger).
package swivl.test.application.viewmodel;

import dagger.internal.Factory;
import javax.inject.Provider;
import swivl.test.application.data.repository.RepositoryApi;

public final class SplashActivityViewModel_Factory implements Factory<SplashActivityViewModel> {
  private final Provider<RepositoryApi> repositoryApiProvider;

  public SplashActivityViewModel_Factory(Provider<RepositoryApi> repositoryApiProvider) {
    this.repositoryApiProvider = repositoryApiProvider;
  }

  @Override
  public SplashActivityViewModel get() {
    return provideInstance(repositoryApiProvider);
  }

  public static SplashActivityViewModel provideInstance(
      Provider<RepositoryApi> repositoryApiProvider) {
    SplashActivityViewModel instance = new SplashActivityViewModel();
    SplashActivityViewModel_MembersInjector.injectRepositoryApi(
        instance, repositoryApiProvider.get());
    return instance;
  }

  public static SplashActivityViewModel_Factory create(
      Provider<RepositoryApi> repositoryApiProvider) {
    return new SplashActivityViewModel_Factory(repositoryApiProvider);
  }

  public static SplashActivityViewModel newSplashActivityViewModel() {
    return new SplashActivityViewModel();
  }
}
