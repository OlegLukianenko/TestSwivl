package swivl.test.application.app.splash;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import swivl.test.application.R;
import swivl.test.application.app.home.MainActivity;
import swivl.test.application.base.BaseActivity;
import swivl.test.application.databinding.ActivitySplashBinding;
import swivl.test.application.utils.CheckInternetDialog;
import swivl.test.application.utils.NetworkHelper;
import swivl.test.application.viewmodel.SplashActivityViewModel;

import static swivl.test.application.utils.Utils.collapse;
import static swivl.test.application.utils.Utils.expand;


public class SplashActivity extends BaseActivity<ActivitySplashBinding> implements
        HasSupportFragmentInjector, CheckInternetDialog.MyListenerInet {

    @Inject
    SplashActivityViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    protected SharedPreferences sharedPreferences;
    private BroadcastReceiver internetConnectionReceiver;

    @Override
    protected int getLayout() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        viewModel.getInternetIsAvailable().postValue(networkHelper.isNetworkAvailable());
        initProfileBroadcastReceiver();
        CheckInternetDialog.setMyListenerInet(this);
        viewModel.getInternetIsAvailable().observe(this, Void -> showSnackBar());
        viewModel.getProgressBarEvent().postValue(true);
    }



    @Override
    protected void onResume() {
        super.onResume();
        checkInternet();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return null;
    }

    private void startMainActivity() {
        viewModel.getProgressBarEvent().postValue(false);
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
        finish();
    }

    public boolean checkInternet() {
        if (!CheckInternetDialog.isOnline(this)) {
            CheckInternetDialog.onCreateAlertDialog(this);
        } else {
            startMainActivity();
            return true;
        }
        return false;
    }


    private void initProfileBroadcastReceiver() {
        internetConnectionReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                viewModel.getInternetIsAvailable().postValue(networkHelper.isNetworkAvailable());
                showSnackBar();
            }
        };

        registerReceiver(internetConnectionReceiver, networkHelper.getIntentFilter());
    }


    private void showSnackBar() {
        if (networkHelper.isNetworkAvailable()) {
            new Handler().postDelayed(() -> collapse(binding.includeLayoutSnackBar.containerWrap), 1500);
        } else {
            expand(binding.includeLayoutSnackBar.containerWrap, this);
        }
    }

    @Override
    public void callSetPositiveButton() {
        startMainActivity();
    }

    @Override
    public void callSetNegativeButton() {
        finish();
    }
}
