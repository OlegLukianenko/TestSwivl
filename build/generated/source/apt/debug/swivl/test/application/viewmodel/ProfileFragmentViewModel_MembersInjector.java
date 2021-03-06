// Generated by Dagger (https://google.github.io/dagger).
package swivl.test.application.viewmodel;

import dagger.MembersInjector;
import javax.inject.Provider;
import swivl.test.application.data.repository.RepositoryApi;

public final class ProfileFragmentViewModel_MembersInjector
    implements MembersInjector<ProfileFragmentViewModel> {
  private final Provider<RepositoryApi> repositoryApiProvider;

  public ProfileFragmentViewModel_MembersInjector(Provider<RepositoryApi> repositoryApiProvider) {
    this.repositoryApiProvider = repositoryApiProvider;
  }

  public static MembersInjector<ProfileFragmentViewModel> create(
      Provider<RepositoryApi> repositoryApiProvider) {
    return new ProfileFragmentViewModel_MembersInjector(repositoryApiProvider);
  }

  @Override
  public void injectMembers(ProfileFragmentViewModel instance) {
    injectRepositoryApi(instance, repositoryApiProvider.get());
  }

  public static void injectRepositoryApi(
      ProfileFragmentViewModel instance, RepositoryApi repositoryApi) {
    instance.repositoryApi = repositoryApi;
  }
}
