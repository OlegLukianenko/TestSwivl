// Generated by Dagger (https://google.github.io/dagger).
package swivl.test.application.di.app;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import swivl.test.application.app.App;
import swivl.test.application.app.App_MembersInjector;
import swivl.test.application.app.home.MainActivity;
import swivl.test.application.app.home.MainActivity_MembersInjector;
import swivl.test.application.app.home.ProfileFragment;
import swivl.test.application.app.home.ProfileFragment_MembersInjector;
import swivl.test.application.app.home.UserListFragment;
import swivl.test.application.app.home.UserListFragment_MembersInjector;
import swivl.test.application.app.home.adapter.UserRecyclerAdapter;
import swivl.test.application.app.splash.SplashActivity;
import swivl.test.application.app.splash.SplashActivity_MembersInjector;
import swivl.test.application.data.repository.RepositoryApi;
import swivl.test.application.data.repository.RepositoryImpl_Factory;
import swivl.test.application.data.retrofit.APIError;
import swivl.test.application.data.retrofit.ServerApi;
import swivl.test.application.di.home.mainActivity.MainActivityComponent;
import swivl.test.application.di.home.profile.ProfileFragmentComponent;
import swivl.test.application.di.home.profile.ProfileFragmentModule;
import swivl.test.application.di.home.profile.ProfileFragmentModule_ProvideViewModelFactory;
import swivl.test.application.di.home.user.UserListFragmentComponent;
import swivl.test.application.di.home.user.UserListFragmentModule;
import swivl.test.application.di.home.user.UserListFragmentModule_ProvideUserAdapterFactory;
import swivl.test.application.di.home.user.UserListFragmentModule_ProvideUserListListenerFactory;
import swivl.test.application.di.home.user.UserListFragmentModule_ProvideViewModelFactory;
import swivl.test.application.di.splash.SplashActivityComponent;
import swivl.test.application.di.splash.SplashModule;
import swivl.test.application.di.splash.SplashModule_ProvideSplashViewModelFactory;
import swivl.test.application.di.viewmodel.ViewModelComponent;
import swivl.test.application.utils.NetworkHelper;
import swivl.test.application.viewmodel.ProfileFragmentViewModel;
import swivl.test.application.viewmodel.ProfileFragmentViewModel_Factory;
import swivl.test.application.viewmodel.ProfileFragmentViewModel_MembersInjector;
import swivl.test.application.viewmodel.SplashActivityViewModel;
import swivl.test.application.viewmodel.SplashActivityViewModel_Factory;
import swivl.test.application.viewmodel.SplashActivityViewModel_MembersInjector;
import swivl.test.application.viewmodel.UserListFragmentViewModel;
import swivl.test.application.viewmodel.UserListFragmentViewModel_Factory;
import swivl.test.application.viewmodel.UserListFragmentViewModel_MembersInjector;

public final class DaggerAppComponent implements AppComponent {
  private Provider<SplashActivityComponent.Builder> splashActivityComponentBuilderProvider;

  private Provider<MainActivityComponent.Builder> mainActivityComponentBuilderProvider;

  private Provider<ViewModelComponent.Builder> viewModelComponentBuilderProvider;

  private Provider<ViewModelProvider.Factory> provideViewModelFactoryProvider;

  private Provider<App> applicationProvider;

  private Provider<NetworkHelper> provideNetworkHelperProvider;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private Provider<OkHttpClient> getOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<ServerApi> getServerApiProvider;

  private Provider<Converter<ResponseBody, APIError>> provideRetrofitConverterProvider;

  private RepositoryImpl_Factory repositoryImplProvider;

  private Provider<RepositoryApi> provideServerApiProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(2)
        .put(SplashActivity.class, (Provider) splashActivityComponentBuilderProvider)
        .put(MainActivity.class, (Provider) mainActivityComponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.splashActivityComponentBuilderProvider =
        new Provider<SplashActivityComponent.Builder>() {
          @Override
          public SplashActivityComponent.Builder get() {
            return new SplashActivityComponentBuilder();
          }
        };
    this.mainActivityComponentBuilderProvider =
        new Provider<MainActivityComponent.Builder>() {
          @Override
          public MainActivityComponent.Builder get() {
            return new MainActivityComponentBuilder();
          }
        };
    this.viewModelComponentBuilderProvider =
        new Provider<ViewModelComponent.Builder>() {
          @Override
          public ViewModelComponent.Builder get() {
            return new ViewModelComponentBuilder();
          }
        };
    this.provideViewModelFactoryProvider =
        DoubleCheck.provider(
            AppModule_ProvideViewModelFactoryFactory.create(
                builder.appModule, viewModelComponentBuilderProvider));
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideNetworkHelperProvider =
        DoubleCheck.provider(
            AppModule_ProvideNetworkHelperFactory.create(builder.appModule, applicationProvider));
    this.provideSharedPreferencesProvider =
        DoubleCheck.provider(
            AppModule_ProvideSharedPreferencesFactory.create(
                builder.appModule, applicationProvider));
    this.getOkHttpClientProvider =
        DoubleCheck.provider(DataModule_GetOkHttpClientFactory.create(builder.dataModule));
    this.provideRetrofitProvider =
        DoubleCheck.provider(
            DataModule_ProvideRetrofitFactory.create(builder.dataModule, getOkHttpClientProvider));
    this.getServerApiProvider =
        DoubleCheck.provider(
            DataModule_GetServerApiFactory.create(builder.dataModule, provideRetrofitProvider));
    this.provideRetrofitConverterProvider =
        DoubleCheck.provider(
            DataModule_ProvideRetrofitConverterFactory.create(
                builder.dataModule, provideRetrofitProvider));
    this.repositoryImplProvider =
        RepositoryImpl_Factory.create(getServerApiProvider, provideRetrofitConverterProvider);
    this.provideServerApiProvider = DoubleCheck.provider((Provider) repositoryImplProvider);
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    App_MembersInjector.injectActivityInjector(instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private DataModule dataModule;

    private App application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (dataModule == null) {
        this.dataModule = new DataModule();
      }
      if (application == null) {
        throw new IllegalStateException(App.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(App app) {
      this.application = Preconditions.checkNotNull(app);
      return this;
    }
  }

  private final class SplashActivityComponentBuilder extends SplashActivityComponent.Builder {
    private SplashModule splashModule;

    private SplashActivity seedInstance;

    @Override
    public SplashActivityComponent build() {
      if (splashModule == null) {
        this.splashModule = new SplashModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(SplashActivity.class.getCanonicalName() + " must be set");
      }
      return new SplashActivityComponentImpl(this);
    }

    @Override
    public void seedInstance(SplashActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SplashActivityComponentImpl implements SplashActivityComponent {
    private SplashModule splashModule;

    private SplashActivity seedInstance;

    private SplashActivityComponentImpl(SplashActivityComponentBuilder builder) {
      initialize(builder);
    }

    private SplashActivityViewModel getSplashActivityViewModel() {
      return SplashModule_ProvideSplashViewModelFactory.proxyProvideSplashViewModel(
          splashModule,
          seedInstance,
          DaggerAppComponent.this.provideViewModelFactoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SplashActivityComponentBuilder builder) {
      this.splashModule = builder.splashModule;
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(SplashActivity arg0) {
      injectSplashActivity(arg0);
    }

    private SplashActivity injectSplashActivity(SplashActivity instance) {
      SplashActivity_MembersInjector.injectViewModel(instance, getSplashActivityViewModel());
      SplashActivity_MembersInjector.injectNetworkHelper(
          instance, DaggerAppComponent.this.provideNetworkHelperProvider.get());
      SplashActivity_MembersInjector.injectSharedPreferences(
          instance, DaggerAppComponent.this.provideSharedPreferencesProvider.get());
      return instance;
    }
  }

  private final class MainActivityComponentBuilder extends MainActivityComponent.Builder {
    private MainActivity seedInstance;

    @Override
    public MainActivityComponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivityComponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivityComponentImpl implements MainActivityComponent {
    private Provider<UserListFragmentComponent.Builder> userListFragmentComponentBuilderProvider;

    private Provider<ProfileFragmentComponent.Builder> profileFragmentComponentBuilderProvider;

    private MainActivityComponentImpl(MainActivityComponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(2)
          .put(UserListFragment.class, (Provider) userListFragmentComponentBuilderProvider)
          .put(ProfileFragment.class, (Provider) profileFragmentComponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivityComponentBuilder builder) {
      this.userListFragmentComponentBuilderProvider =
          new Provider<UserListFragmentComponent.Builder>() {
            @Override
            public UserListFragmentComponent.Builder get() {
              return new UserListFragmentComponentBuilder();
            }
          };
      this.profileFragmentComponentBuilderProvider =
          new Provider<ProfileFragmentComponent.Builder>() {
            @Override
            public ProfileFragmentComponent.Builder get() {
              return new ProfileFragmentComponentBuilder();
            }
          };
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectFragmentDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      return instance;
    }

    private final class UserListFragmentComponentBuilder extends UserListFragmentComponent.Builder {
      private UserListFragmentModule userListFragmentModule;

      private UserListFragment seedInstance;

      @Override
      public UserListFragmentComponent build() {
        if (userListFragmentModule == null) {
          this.userListFragmentModule = new UserListFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(
              UserListFragment.class.getCanonicalName() + " must be set");
        }
        return new UserListFragmentComponentImpl(this);
      }

      @Override
      public void seedInstance(UserListFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class UserListFragmentComponentImpl implements UserListFragmentComponent {
      private UserListFragmentModule userListFragmentModule;

      private UserListFragment seedInstance;

      private UserListFragmentComponentImpl(UserListFragmentComponentBuilder builder) {
        initialize(builder);
      }

      private UserListFragmentViewModel getUserListFragmentViewModel() {
        return UserListFragmentModule_ProvideViewModelFactory.proxyProvideViewModel(
            userListFragmentModule,
            seedInstance,
            DaggerAppComponent.this.provideViewModelFactoryProvider.get());
      }

      private UserRecyclerAdapter.UserItemListListener getUserItemListListener() {
        return UserListFragmentModule_ProvideUserListListenerFactory.proxyProvideUserListListener(
            userListFragmentModule, seedInstance);
      }

      private UserRecyclerAdapter getUserRecyclerAdapter() {
        return UserListFragmentModule_ProvideUserAdapterFactory.proxyProvideUserAdapter(
            userListFragmentModule, getUserItemListListener());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final UserListFragmentComponentBuilder builder) {
        this.userListFragmentModule = builder.userListFragmentModule;
        this.seedInstance = builder.seedInstance;
      }

      @Override
      public void inject(UserListFragment arg0) {
        injectUserListFragment(arg0);
      }

      private UserListFragment injectUserListFragment(UserListFragment instance) {
        UserListFragment_MembersInjector.injectViewModel(instance, getUserListFragmentViewModel());
        UserListFragment_MembersInjector.injectNetworkHelper(
            instance, DaggerAppComponent.this.provideNetworkHelperProvider.get());
        UserListFragment_MembersInjector.injectUserRecyclerAdapter(
            instance, getUserRecyclerAdapter());
        return instance;
      }
    }

    private final class ProfileFragmentComponentBuilder extends ProfileFragmentComponent.Builder {
      private ProfileFragmentModule profileFragmentModule;

      private ProfileFragment seedInstance;

      @Override
      public ProfileFragmentComponent build() {
        if (profileFragmentModule == null) {
          this.profileFragmentModule = new ProfileFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(
              ProfileFragment.class.getCanonicalName() + " must be set");
        }
        return new ProfileFragmentComponentImpl(this);
      }

      @Override
      public void seedInstance(ProfileFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ProfileFragmentComponentImpl implements ProfileFragmentComponent {
      private ProfileFragmentModule profileFragmentModule;

      private ProfileFragment seedInstance;

      private ProfileFragmentComponentImpl(ProfileFragmentComponentBuilder builder) {
        initialize(builder);
      }

      private ProfileFragmentViewModel getProfileFragmentViewModel() {
        return ProfileFragmentModule_ProvideViewModelFactory.proxyProvideViewModel(
            profileFragmentModule,
            seedInstance,
            DaggerAppComponent.this.provideViewModelFactoryProvider.get());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ProfileFragmentComponentBuilder builder) {
        this.profileFragmentModule = builder.profileFragmentModule;
        this.seedInstance = builder.seedInstance;
      }

      @Override
      public void inject(ProfileFragment arg0) {
        injectProfileFragment(arg0);
      }

      private ProfileFragment injectProfileFragment(ProfileFragment instance) {
        ProfileFragment_MembersInjector.injectViewModel(instance, getProfileFragmentViewModel());
        ProfileFragment_MembersInjector.injectNetworkHelper(
            instance, DaggerAppComponent.this.provideNetworkHelperProvider.get());
        return instance;
      }
    }
  }

  private final class ViewModelComponentBuilder implements ViewModelComponent.Builder {
    @Override
    public ViewModelComponent build() {
      return new ViewModelComponentImpl(this);
    }
  }

  private final class ViewModelComponentImpl implements ViewModelComponent {
    private ViewModelComponentImpl(ViewModelComponentBuilder builder) {}

    @Override
    public SplashActivityViewModel splashActivityViewModel() {
      return injectSplashActivityViewModel(
          SplashActivityViewModel_Factory.newSplashActivityViewModel());
    }

    @Override
    public UserListFragmentViewModel userFragmentViewModel() {
      return injectUserListFragmentViewModel(
          UserListFragmentViewModel_Factory.newUserListFragmentViewModel());
    }

    @Override
    public ProfileFragmentViewModel profileFragmentViewModel() {
      return injectProfileFragmentViewModel(
          ProfileFragmentViewModel_Factory.newProfileFragmentViewModel());
    }

    private SplashActivityViewModel injectSplashActivityViewModel(
        SplashActivityViewModel instance) {
      SplashActivityViewModel_MembersInjector.injectRepositoryApi(
          instance, DaggerAppComponent.this.provideServerApiProvider.get());
      return instance;
    }

    private UserListFragmentViewModel injectUserListFragmentViewModel(
        UserListFragmentViewModel instance) {
      UserListFragmentViewModel_MembersInjector.injectRepositoryApi(
          instance, DaggerAppComponent.this.provideServerApiProvider.get());
      return instance;
    }

    private ProfileFragmentViewModel injectProfileFragmentViewModel(
        ProfileFragmentViewModel instance) {
      ProfileFragmentViewModel_MembersInjector.injectRepositoryApi(
          instance, DaggerAppComponent.this.provideServerApiProvider.get());
      return instance;
    }
  }
}
