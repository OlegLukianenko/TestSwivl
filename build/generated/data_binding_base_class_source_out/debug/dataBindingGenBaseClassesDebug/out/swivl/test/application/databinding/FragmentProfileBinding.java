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
import android.widget.ImageView;
import android.widget.TextView;
import swivl.test.application.app.home.ProfileFragment;
import swivl.test.application.data.retrofit.response.Profile;
import swivl.test.application.viewmodel.ProfileFragmentViewModel;

public abstract class FragmentProfileBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final TextView followers;

  @NonNull
  public final TextView gists;

  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final LayoutProfileProgressBarBinding includeLayoutProgressBar;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final TextView profileLink;

  @NonNull
  public final TextView profileName;

  @NonNull
  public final TextView repos;

  @NonNull
  public final TextView textFollowers;

  @NonNull
  public final TextView textGists;

  @NonNull
  public final TextView textPricing;

  @NonNull
  public final TextView textRepos;

  @Bindable
  protected Profile mData;

  @Bindable
  protected ProfileFragmentViewModel mViewModel;

  @Bindable
  protected ProfileFragment mHandler;

  protected FragmentProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView backArrow, TextView followers, TextView gists,
      ConstraintLayout headerBackground, View headerResizer,
      LayoutProfileProgressBarBinding includeLayoutProgressBar, ImageView profileImage,
      TextView profileLink, TextView profileName, TextView repos, TextView textFollowers,
      TextView textGists, TextView textPricing, TextView textRepos) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backArrow = backArrow;
    this.followers = followers;
    this.gists = gists;
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.includeLayoutProgressBar = includeLayoutProgressBar;
    setContainedBinding(this.includeLayoutProgressBar);;
    this.profileImage = profileImage;
    this.profileLink = profileLink;
    this.profileName = profileName;
    this.repos = repos;
    this.textFollowers = textFollowers;
    this.textGists = textGists;
    this.textPricing = textPricing;
    this.textRepos = textRepos;
  }

  public abstract void setData(@Nullable Profile data);

  @Nullable
  public Profile getData() {
    return mData;
  }

  public abstract void setViewModel(@Nullable ProfileFragmentViewModel viewModel);

  @Nullable
  public ProfileFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHandler(@Nullable ProfileFragment handler);

  @Nullable
  public ProfileFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProfileBinding>inflate(inflater, swivl.test.application.R.layout.fragment_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProfileBinding>inflate(inflater, swivl.test.application.R.layout.fragment_profile, null, false, component);
  }

  public static FragmentProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentProfileBinding)bind(component, view, swivl.test.application.R.layout.fragment_profile);
  }
}
