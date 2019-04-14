package swivl.test.application.di.app;

import android.support.annotation.NonNull;

import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import swivl.test.application.data.retrofit.APIError;
import swivl.test.application.data.retrofit.ServerApi;

@Module
public class DataModule {

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    public OkHttpClient getOkHttpClient() {
        return new  OkHttpClient.Builder()
                .hostnameVerifier(((hostname, session) -> true))
                .connectTimeout(15, TimeUnit.SECONDS)
                .build();
    }

    @Provides
    @Singleton
    public ServerApi getServerApi(Retrofit retrofit) {
        return retrofit.create(ServerApi.class);
    }


    @Provides
    @NonNull
    @Singleton
    Converter<ResponseBody, APIError> provideRetrofitConverter(Retrofit retrofit) {
        return retrofit.responseBodyConverter(APIError.class, new Annotation[0]);
    }
}