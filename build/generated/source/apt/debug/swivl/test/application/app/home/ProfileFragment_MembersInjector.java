// Generated by Dagger (https://google.github.io/dagger).
package swivl.test.application.app.home;

import dagger.MembersInjector;
import javax.inject.Provider;
import swivl.test.application.utils.NetworkHelper;
import swivl.test.application.viewmodel.ProfileFragmentViewModel;

public final class ProfileFragment_MembersInjector implements MembersInjector<ProfileFragment> {
  private final Provider<ProfileFragmentViewModel> viewModelProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public ProfileFragment_MembersInjector(
      Provider<ProfileFragmentViewModel> viewModelProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.viewModelProvider = viewModelProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  public static MembersInjector<ProfileFragment> create(
      Provider<ProfileFragmentViewModel> viewModelProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new ProfileFragment_MembersInjector(viewModelProvider, networkHelperProvider);
  }

  @Override
  public void injectMembers(ProfileFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
    injectNetworkHelper(instance, networkHelperProvider.get());
  }

  public static void injectViewModel(ProfileFragment instance, ProfileFragmentViewModel viewModel) {
    instance.viewModel = viewModel;
  }

  public static void injectNetworkHelper(ProfileFragment instance, NetworkHelper networkHelper) {
    instance.networkHelper = networkHelper;
  }
}