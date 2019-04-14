package swivl.test.application.app.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import swivl.test.application.R;
import swivl.test.application.base.BaseActivity;
import swivl.test.application.databinding.ActivityMainBinding;


public class MainActivity extends BaseActivity<ActivityMainBinding> implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null)
            showFragment(new UserListFragment());
    }

    public void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.cardinal, fragment).addToBackStack(null).commit();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }


    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1)
            finish();
        else
            super.onBackPressed();
    }
}
