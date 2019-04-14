package swivl.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import swivl.test.application.viewmodel.SplashActivityViewModel;

public abstract class ActivitySplashBinding extends ViewDataBinding {
  @NonNull
  public final TextView appName;

  @NonNull
  public final LayoutSnackBarBinding includeLayoutSnackBar;

  @NonNull
  public final ProgressBar progressBar;

  @Bindable
  protected SplashActivityViewModel mViewModel;

  @Bindable
  protected View mView;

  protected ActivitySplashBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView appName, LayoutSnackBarBinding includeLayoutSnackBar,
      ProgressBar progressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appName = appName;
    this.includeLayoutSnackBar = includeLayoutSnackBar;
    setContainedBinding(this.includeLayoutSnackBar);;
    this.progressBar = progressBar;
  }

  public abstract void setViewModel(@Nullable SplashActivityViewModel viewModel);

  @Nullable
  public SplashActivityViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setView(@Nullable View view);

  @Nullable
  public View getView() {
    return mView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySplashBinding>inflate(inflater, swivl.test.application.R.layout.activity_splash, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySplashBinding>inflate(inflater, swivl.test.application.R.layout.activity_splash, null, false, component);
  }

  public static ActivitySplashBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivitySplashBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySplashBinding)bind(component, view, swivl.test.application.R.layout.activity_splash);
  }
}
