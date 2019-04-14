package swivl.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import swivl.test.application.viewmodel.SplashActivityViewModel;

public abstract class LayoutSnackBarBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout containerWrap;

  @NonNull
  public final TextView message;

  @Bindable
  protected SplashActivityViewModel mViewModel;

  protected LayoutSnackBarBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout containerWrap, TextView message) {
    super(_bindingComponent, _root, _localFieldCount);
    this.containerWrap = containerWrap;
    this.message = message;
  }

  public abstract void setViewModel(@Nullable SplashActivityViewModel viewModel);

  @Nullable
  public SplashActivityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutSnackBarBinding>inflate(inflater, swivl.test.application.R.layout.layout_snack_bar, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutSnackBarBinding>inflate(inflater, swivl.test.application.R.layout.layout_snack_bar, null, false, component);
  }

  public static LayoutSnackBarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutSnackBarBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutSnackBarBinding)bind(component, view, swivl.test.application.R.layout.layout_snack_bar);
  }
}
