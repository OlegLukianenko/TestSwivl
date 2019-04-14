// Generated by Dagger (https://google.github.io/dagger).
package swivl.test.application.di.app;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import swivl.test.application.data.retrofit.APIError;

public final class DataModule_ProvideRetrofitConverterFactory
    implements Factory<Converter<ResponseBody, APIError>> {
  private final DataModule module;

  private final Provider<Retrofit> retrofitProvider;

  public DataModule_ProvideRetrofitConverterFactory(
      DataModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public Converter<ResponseBody, APIError> get() {
    return provideInstance(module, retrofitProvider);
  }

  public static Converter<ResponseBody, APIError> provideInstance(
      DataModule module, Provider<Retrofit> retrofitProvider) {
    return proxyProvideRetrofitConverter(module, retrofitProvider.get());
  }

  public static DataModule_ProvideRetrofitConverterFactory create(
      DataModule module, Provider<Retrofit> retrofitProvider) {
    return new DataModule_ProvideRetrofitConverterFactory(module, retrofitProvider);
  }

  public static Converter<ResponseBody, APIError> proxyProvideRetrofitConverter(
      DataModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.provideRetrofitConverter(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
