package swivl.test.application.databinding;
import swivl.test.application.R;
import swivl.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding implements swivl.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(0, 
            new String[] {"layout_profile_progress_bar"},
            new int[] {9},
            new int[] {R.layout.layout_profile_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 10);
        sViewsWithIds.put(R.id.headerResizer, 11);
        sViewsWithIds.put(R.id.textRepos, 12);
        sViewsWithIds.put(R.id.textFollowers, 13);
        sViewsWithIds.put(R.id.textGists, 14);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.support.constraint.ConstraintLayout) bindings[10]
            , (android.view.View) bindings[11]
            , (swivl.test.application.databinding.LayoutProfileProgressBarBinding) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            );
        this.backArrow.setTag(null);
        this.followers.setTag(null);
        this.gists.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.profileImage.setTag(null);
        this.profileLink.setTag(null);
        this.profileName.setTag(null);
        this.repos.setTag(null);
        this.textPricing.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new swivl.test.application.generated.callback.OnClickListener(this, 2);
        mCallback1 = new swivl.test.application.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        includeLayoutProgressBar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeLayoutProgressBar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((swivl.test.application.app.home.ProfileFragment) variable);
        }
        else if (BR.data == variableId) {
            setData((swivl.test.application.data.retrofit.response.Profile) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((swivl.test.application.viewmodel.ProfileFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable swivl.test.application.app.home.ProfileFragment Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setData(@Nullable swivl.test.application.data.retrofit.response.Profile Data) {
        this.mData = Data;
    }
    public void setViewModel(@Nullable swivl.test.application.viewmodel.ProfileFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeLayoutProgressBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetProfileFromApi((android.arch.lifecycle.MutableLiveData<swivl.test.application.data.retrofit.ResponseWrap<swivl.test.application.data.retrofit.response.Profile>>) object, fieldId);
            case 1 :
                return onChangeIncludeLayoutProgressBar((swivl.test.application.databinding.LayoutProfileProgressBarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetProfileFromApi(android.arch.lifecycle.MutableLiveData<swivl.test.application.data.retrofit.ResponseWrap<swivl.test.application.data.retrofit.response.Profile>> ViewModelGetProfileFromApi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeLayoutProgressBar(swivl.test.application.databinding.LayoutProfileProgressBarBinding IncludeLayoutProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelGetProfileFromApiDataAvatarUrl = null;
        swivl.test.application.data.retrofit.response.Profile viewModelGetProfileFromApiData = null;
        swivl.test.application.data.retrofit.ResponseWrap<swivl.test.application.data.retrofit.response.Profile> viewModelGetProfileFromApiGetValue = null;
        android.arch.lifecycle.MutableLiveData<swivl.test.application.data.retrofit.ResponseWrap<swivl.test.application.data.retrofit.response.Profile>> viewModelGetProfileFromApi = null;
        java.lang.String viewModelGetProfileFromApiDataHtmlUrl = null;
        swivl.test.application.app.home.ProfileFragment handler = mHandler;
        java.lang.String viewModelGetProfileFromApiDataName = null;
        java.lang.String viewModelGetProfileFromApiDataPublicGists = null;
        java.lang.String viewModelGetProfileFromApiDataFollowers = null;
        swivl.test.application.viewmodel.ProfileFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x31L) != 0) {



                if (viewModel != null) {
                    // read viewModel.getProfileFromApi()
                    viewModelGetProfileFromApi = viewModel.getProfileFromApi();
                }
                updateLiveDataRegistration(0, viewModelGetProfileFromApi);


                if (viewModelGetProfileFromApi != null) {
                    // read viewModel.getProfileFromApi().getValue()
                    viewModelGetProfileFromApiGetValue = viewModelGetProfileFromApi.getValue();
                }


                if (viewModelGetProfileFromApiGetValue != null) {
                    // read viewModel.getProfileFromApi().getValue().data
                    viewModelGetProfileFromApiData = viewModelGetProfileFromApiGetValue.data;
                }


                if (viewModelGetProfileFromApiData != null) {
                    // read viewModel.getProfileFromApi().getValue().data.avatarUrl
                    viewModelGetProfileFromApiDataAvatarUrl = viewModelGetProfileFromApiData.avatarUrl;
                    // read viewModel.getProfileFromApi().getValue().data.htmlUrl
                    viewModelGetProfileFromApiDataHtmlUrl = viewModelGetProfileFromApiData.htmlUrl;
                    // read viewModel.getProfileFromApi().getValue().data.name
                    viewModelGetProfileFromApiDataName = viewModelGetProfileFromApiData.name;
                    // read viewModel.getProfileFromApi().getValue().data.publicGists
                    viewModelGetProfileFromApiDataPublicGists = viewModelGetProfileFromApiData.publicGists;
                    // read viewModel.getProfileFromApi().getValue().data.followers
                    viewModelGetProfileFromApiDataFollowers = viewModelGetProfileFromApiData.followers;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.backArrow.setOnClickListener(mCallback1);
            this.profileLink.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.followers, viewModelGetProfileFromApiDataFollowers);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.gists, viewModelGetProfileFromApiDataPublicGists);
            swivl.test.application.utils.BindingAdapters.setAvatar(this.profileImage, viewModelGetProfileFromApiDataAvatarUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.profileLink, viewModelGetProfileFromApiDataHtmlUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.profileName, viewModelGetProfileFromApiDataName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.repos, viewModelGetProfileFromApiDataPublicGists);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textPricing, viewModelGetProfileFromApiDataName);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.includeLayoutProgressBar.setViewModel(viewModel);
        }
        executeBindingsOn(includeLayoutProgressBar);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                swivl.test.application.app.home.ProfileFragment handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // viewModel.getProfileFromApi()
                android.arch.lifecycle.MutableLiveData<swivl.test.application.data.retrofit.ResponseWrap<swivl.test.application.data.retrofit.response.Profile>> viewModelGetProfileFromApi = null;
                // viewModel.getProfileFromApi().getValue().data.htmlUrl
                java.lang.String viewModelGetProfileFromApiDataHtmlUrl = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.getProfileFromApi().getValue().data
                swivl.test.application.data.retrofit.response.Profile viewModelGetProfileFromApiData = null;
                // viewModel.getProfileFromApi().getValue() != null
                boolean viewModelGetProfileFromApiGetValueJavaLangObjectNull = false;
                // viewModel.getProfileFromApi().getValue().data != null
                boolean viewModelGetProfileFromApiDataJavaLangObjectNull = false;
                // viewModel.getProfileFromApi() != null
                boolean viewModelGetProfileFromApiJavaLangObjectNull = false;
                // viewModel
                swivl.test.application.viewmodel.ProfileFragmentViewModel viewModel = mViewModel;
                // viewModel.getProfileFromApi().getValue()
                swivl.test.application.data.retrofit.ResponseWrap<swivl.test.application.data.retrofit.response.Profile> viewModelGetProfileFromApiGetValue = null;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    viewModelJavaLangObjectNull = (viewModel) != (null);
                    if (viewModelJavaLangObjectNull) {


                        viewModelGetProfileFromApi = viewModel.getProfileFromApi();

                        viewModelGetProfileFromApiJavaLangObjectNull = (viewModelGetProfileFromApi) != (null);
                        if (viewModelGetProfileFromApiJavaLangObjectNull) {


                            viewModelGetProfileFromApiGetValue = viewModelGetProfileFromApi.getValue();

                            viewModelGetProfileFromApiGetValueJavaLangObjectNull = (viewModelGetProfileFromApiGetValue) != (null);
                            if (viewModelGetProfileFromApiGetValueJavaLangObjectNull) {


                                viewModelGetProfileFromApiData = viewModelGetProfileFromApiGetValue.data;

                                viewModelGetProfileFromApiDataJavaLangObjectNull = (viewModelGetProfileFromApiData) != (null);
                                if (viewModelGetProfileFromApiDataJavaLangObjectNull) {


                                    viewModelGetProfileFromApiDataHtmlUrl = viewModelGetProfileFromApiData.htmlUrl;

                                    handler.openLink(viewModelGetProfileFromApiDataHtmlUrl);
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                swivl.test.application.app.home.ProfileFragment handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.clickBackButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getProfileFromApi()
        flag 1 (0x2L): includeLayoutProgressBar
        flag 2 (0x3L): handler
        flag 3 (0x4L): data
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}