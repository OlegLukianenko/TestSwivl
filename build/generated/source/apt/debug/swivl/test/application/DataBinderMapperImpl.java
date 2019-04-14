package swivl.test.application;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import swivl.test.application.databinding.ActivityMainBindingImpl;
import swivl.test.application.databinding.ActivitySplashBindingImpl;
import swivl.test.application.databinding.FragmentProfileBindingImpl;
import swivl.test.application.databinding.FragmentUserBindingImpl;
import swivl.test.application.databinding.LayoutProfileProgressBarBindingImpl;
import swivl.test.application.databinding.LayoutSnackBarBindingImpl;
import swivl.test.application.databinding.LayoutUserProgressBarBindingImpl;
import swivl.test.application.databinding.UserRecyclerItemBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_FRAGMENTPROFILE = 3;

  private static final int LAYOUT_FRAGMENTUSER = 4;

  private static final int LAYOUT_LAYOUTPROFILEPROGRESSBAR = 5;

  private static final int LAYOUT_LAYOUTSNACKBAR = 6;

  private static final int LAYOUT_LAYOUTUSERPROGRESSBAR = 7;

  private static final int LAYOUT_USERRECYCLERITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.fragment_user, LAYOUT_FRAGMENTUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.layout_profile_progress_bar, LAYOUT_LAYOUTPROFILEPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.layout_snack_bar, LAYOUT_LAYOUTSNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.layout_user_progress_bar, LAYOUT_LAYOUTUSERPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(swivl.test.application.R.layout.user_recycler_item, LAYOUT_USERRECYCLERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSER: {
          if ("layout/fragment_user_0".equals(tag)) {
            return new FragmentUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROFILEPROGRESSBAR: {
          if ("layout/layout_profile_progress_bar_0".equals(tag)) {
            return new LayoutProfileProgressBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_profile_progress_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSNACKBAR: {
          if ("layout/layout_snack_bar_0".equals(tag)) {
            return new LayoutSnackBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_snack_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTUSERPROGRESSBAR: {
          if ("layout/layout_user_progress_bar_0".equals(tag)) {
            return new LayoutUserProgressBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_user_progress_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_USERRECYCLERITEM: {
          if ("layout/user_recycler_item_0".equals(tag)) {
            return new UserRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_recycler_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "handler");
      sKeys.put(2, "view");
      sKeys.put(3, "adapter");
      sKeys.put(4, "data");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", swivl.test.application.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", swivl.test.application.R.layout.activity_splash);
      sKeys.put("layout/fragment_profile_0", swivl.test.application.R.layout.fragment_profile);
      sKeys.put("layout/fragment_user_0", swivl.test.application.R.layout.fragment_user);
      sKeys.put("layout/layout_profile_progress_bar_0", swivl.test.application.R.layout.layout_profile_progress_bar);
      sKeys.put("layout/layout_snack_bar_0", swivl.test.application.R.layout.layout_snack_bar);
      sKeys.put("layout/layout_user_progress_bar_0", swivl.test.application.R.layout.layout_user_progress_bar);
      sKeys.put("layout/user_recycler_item_0", swivl.test.application.R.layout.user_recycler_item);
    }
  }
}
