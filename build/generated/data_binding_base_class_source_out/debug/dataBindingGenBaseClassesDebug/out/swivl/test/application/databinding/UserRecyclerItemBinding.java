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
import android.widget.ImageView;
import android.widget.TextView;
import swivl.test.application.app.home.adapter.UserRecyclerAdapter;
import swivl.test.application.data.retrofit.response.User;

public abstract class UserRecyclerItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView Temp;

  @NonNull
  public final ImageView image;

  @NonNull
  public final View roundedBackground;

  @Bindable
  protected User mData;

  @Bindable
  protected UserRecyclerAdapter mAdapter;

  protected UserRecyclerItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView Temp, ImageView image, View roundedBackground) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Temp = Temp;
    this.image = image;
    this.roundedBackground = roundedBackground;
  }

  public abstract void setData(@Nullable User data);

  @Nullable
  public User getData() {
    return mData;
  }

  public abstract void setAdapter(@Nullable UserRecyclerAdapter adapter);

  @Nullable
  public UserRecyclerAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static UserRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static UserRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<UserRecyclerItemBinding>inflate(inflater, swivl.test.application.R.layout.user_recycler_item, root, attachToRoot, component);
  }

  @NonNull
  public static UserRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static UserRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<UserRecyclerItemBinding>inflate(inflater, swivl.test.application.R.layout.user_recycler_item, null, false, component);
  }

  public static UserRecyclerItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static UserRecyclerItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (UserRecyclerItemBinding)bind(component, view, swivl.test.application.R.layout.user_recycler_item);
  }
}
