package swivl.test.application.databinding;
import swivl.test.application.R;
import swivl.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutSnackBarBindingImpl extends LayoutSnackBarBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutSnackBarBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private LayoutSnackBarBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.constraint.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            );
        this.containerWrap.setTag(null);
        this.message.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((swivl.test.application.viewmodel.SplashActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable swivl.test.application.viewmodel.SplashActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelInternetIsAvailable((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelInternetIsAvailable(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelInternetIsAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelInternetIsAvailableGetValue = false;
        java.lang.String viewModelInternetIsAvailableMessageAndroidStringInternetConnectedMessageAndroidStringInternetNotAvailable = null;
        java.lang.Boolean viewModelInternetIsAvailableGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelInternetIsAvailable = null;
        int viewModelInternetIsAvailableContainerWrapAndroidColorInternetAvailableContainerWrapAndroidColorInternetNotAvailable = 0;
        swivl.test.application.viewmodel.SplashActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.internetIsAvailable
                    viewModelInternetIsAvailable = viewModel.getInternetIsAvailable();
                }
                updateLiveDataRegistration(0, viewModelInternetIsAvailable);


                if (viewModelInternetIsAvailable != null) {
                    // read viewModel.internetIsAvailable.getValue()
                    viewModelInternetIsAvailableGetValue = viewModelInternetIsAvailable.getValue();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.internetIsAvailable.getValue())
                androidDatabindingViewDataBindingSafeUnboxViewModelInternetIsAvailableGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelInternetIsAvailableGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxViewModelInternetIsAvailableGetValue) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.internetIsAvailable.getValue()) ? @android:string/internet_connected : @android:string/internet_not_available
                viewModelInternetIsAvailableMessageAndroidStringInternetConnectedMessageAndroidStringInternetNotAvailable = ((androidDatabindingViewDataBindingSafeUnboxViewModelInternetIsAvailableGetValue) ? (message.getResources().getString(R.string.internet_connected)) : (message.getResources().getString(R.string.internet_not_available)));
                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.internetIsAvailable.getValue()) ? @android:color/internet_available : @android:color/internet_not_available
                viewModelInternetIsAvailableContainerWrapAndroidColorInternetAvailableContainerWrapAndroidColorInternetNotAvailable = ((androidDatabindingViewDataBindingSafeUnboxViewModelInternetIsAvailableGetValue) ? (getColorFromResource(containerWrap, R.color.internet_available)) : (getColorFromResource(containerWrap, R.color.internet_not_available)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.containerWrap, android.databinding.adapters.Converters.convertColorToDrawable(viewModelInternetIsAvailableContainerWrapAndroidColorInternetAvailableContainerWrapAndroidColorInternetNotAvailable));
            android.databinding.adapters.TextViewBindingAdapter.setText(this.message, viewModelInternetIsAvailableMessageAndroidStringInternetConnectedMessageAndroidStringInternetNotAvailable);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.internetIsAvailable
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): android.databinding.ViewDataBinding.safeUnbox(viewModel.internetIsAvailable.getValue()) ? @android:string/internet_connected : @android:string/internet_not_available
        flag 4 (0x5L): android.databinding.ViewDataBinding.safeUnbox(viewModel.internetIsAvailable.getValue()) ? @android:string/internet_connected : @android:string/internet_not_available
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(viewModel.internetIsAvailable.getValue()) ? @android:color/internet_available : @android:color/internet_not_available
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(viewModel.internetIsAvailable.getValue()) ? @android:color/internet_available : @android:color/internet_not_available
    flag mapping end*/
    //end
}