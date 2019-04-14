package swivl.test.application.databinding;
import swivl.test.application.R;
import swivl.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutProfileProgressBarBindingImpl extends LayoutProfileProgressBarBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progressBar, 1);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutProfileProgressBarBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private LayoutProfileProgressBarBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[1]
            , (android.support.constraint.ConstraintLayout) bindings[0]
            );
        this.progressBarWrap.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.view == variableId) {
            setView((android.view.View) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((swivl.test.application.viewmodel.ProfileFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }
    public void setViewModel(@Nullable swivl.test.application.viewmodel.ProfileFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetProgressBarEvent((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetProgressBarEvent(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelGetProgressBarEvent, int fieldId) {
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
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue = false;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGetProgressBarEvent = null;
        java.lang.Boolean viewModelGetProgressBarEventGetValue = null;
        int viewModelGetProgressBarEventViewVISIBLEViewGONE = 0;
        swivl.test.application.viewmodel.ProfileFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.getProgressBarEvent()
                    viewModelGetProgressBarEvent = viewModel.getProgressBarEvent();
                }
                updateLiveDataRegistration(0, viewModelGetProgressBarEvent);


                if (viewModelGetProgressBarEvent != null) {
                    // read viewModel.getProgressBarEvent().getValue()
                    viewModelGetProgressBarEventGetValue = viewModelGetProgressBarEvent.getValue();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue())
                androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelGetProgressBarEventGetValue);
            if((dirtyFlags & 0xdL) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue()) ? View.VISIBLE : View.GONE
                viewModelGetProgressBarEventViewVISIBLEViewGONE = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetProgressBarEventGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.progressBarWrap.setVisibility(viewModelGetProgressBarEventViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getProgressBarEvent()
        flag 1 (0x2L): view
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getProgressBarEvent().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}