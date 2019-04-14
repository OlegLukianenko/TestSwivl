package swivl.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import swivl.test.application.app.home.UserListFragment;
import swivl.test.application.viewmodel.UserListFragmentViewModel;

public abstract class FragmentUserBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final LayoutUserProgressBarBinding includeLayoutProgressBar;

  @NonNull
  public final RecyclerView recycleView;

  @NonNull
  public final SwipeRefreshLayout refreshView;

  @NonNull
  public final TextView textPricing;

  @Bindable
  protected UserListFragmentViewModel mViewModel;

  @Bindable
  protected UserListFragment mHandler;

  protected FragmentUserBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout headerBackground, View headerResizer,
      LayoutUserProgressBarBinding includeLayoutProgressBar, RecyclerView recycleView,
      SwipeRefreshLayout refreshView, TextView textPricing) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.includeLayoutProgressBar = includeLayoutProgressBar;
    setContainedBinding(this.includeLayoutProgressBar);;
    this.recycleView = recycleView;
    this.refreshView = refreshView;
    this.textPricing = textPricing;
  }

  public abstract void setViewModel(@Nullable UserListFragmentViewModel viewModel);

  @Nullable
  public UserListFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHandler(@Nullable UserListFragment handler);

  @Nullable
  public UserListFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserBinding>inflate(inflater, swivl.test.application.R.layout.fragment_user, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserBinding>inflate(inflater, swivl.test.application.R.layout.fragment_user, null, false, component);
  }

  public static FragmentUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentUserBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentUserBinding)bind(component, view, swivl.test.application.R.layout.fragment_user);
  }
}
