package swivl.test.application.databinding;
import swivl.test.application.R;
import swivl.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySplashBindingImpl extends ActivitySplashBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"layout_snack_bar"},
            new int[] {2},
            new int[] {R.layout.layout_snack_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appName, 3);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySplashBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivitySplashBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[3]
            , (swivl.test.application.databinding.LayoutSnackBarBinding) bindings[2]
            , (android.widget.ProgressBar) bindings[1]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        includeLayoutSnackBar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeLayoutSnackBar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.view == variableId) {
            setView((android.view.View) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((swivl.test.application.viewmodel.SplashActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }
    public void setViewModel(@Nullable swivl.test.application.viewmodel.SplashActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeLayoutSnackBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeLayoutSnackBar((swivl.test.application.databinding.LayoutSnackBarBinding) object, fieldId);
            case 1 :
                return onChangeViewModelGetProgressBarEvent((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeLayoutSnackBar(swivl.test.application.databinding.LayoutSnackBarBinding IncludeLayoutSnackBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetProgressBarEvent(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelGetProgressBarEvent, int fieldId) {
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
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue = false;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGetProgressBarEvent = null;
        java.lang.Boolean viewModelGetProgressBarEventGetValue = null;
        int viewModelGetProgressBarEventViewVISIBLEViewGONE = 0;
        swivl.test.application.viewmodel.SplashActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1aL) != 0) {



                if (viewModel != null) {
                    // read viewModel.getProgressBarEvent()
                    viewModelGetProgressBarEvent = viewModel.getProgressBarEvent();
                }
                updateLiveDataRegistration(1, viewModelGetProgressBarEvent);


                if (viewModelGetProgressBarEvent != null) {
                    // read viewModel.getProgressBarEvent().getValue()
                    viewModelGetProgressBarEventGetValue = viewModelGetProgressBarEvent.getValue();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue())
                androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelGetProgressBarEventGetValue);
            if((dirtyFlags & 0x1aL) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue()) ? View.VISIBLE : View.GONE
                viewModelGetProgressBarEventViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.includeLayoutSnackBar.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelGetProgressBarEventViewVISIBLEViewGONE);
        }
        executeBindingsOn(includeLayoutSnackBar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeLayoutSnackBar
        flag 1 (0x2L): viewModel.getProgressBarEvent()
        flag 2 (0x3L): view
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}