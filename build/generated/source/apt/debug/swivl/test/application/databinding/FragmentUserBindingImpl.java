package swivl.test.application.databinding;
import swivl.test.application.R;
import swivl.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserBindingImpl extends FragmentUserBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"layout_user_progress_bar"},
            new int[] {1},
            new int[] {R.layout.layout_user_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 2);
        sViewsWithIds.put(R.id.headerResizer, 3);
        sViewsWithIds.put(R.id.textPricing, 4);
        sViewsWithIds.put(R.id.refreshView, 5);
        sViewsWithIds.put(R.id.recycleView, 6);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentUserBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.constraint.ConstraintLayout) bindings[2]
            , (android.view.View) bindings[3]
            , (swivl.test.application.databinding.LayoutUserProgressBarBinding) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[6]
            , (android.support.v4.widget.SwipeRefreshLayout) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setHandler((swivl.test.application.app.home.UserListFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((swivl.test.application.viewmodel.UserListFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable swivl.test.application.app.home.UserListFragment Handler) {
        this.mHandler = Handler;
    }
    public void setViewModel(@Nullable swivl.test.application.viewmodel.UserListFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
                return onChangeIncludeLayoutProgressBar((swivl.test.application.databinding.LayoutUserProgressBarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeLayoutProgressBar(swivl.test.application.databinding.LayoutUserProgressBarBinding IncludeLayoutProgressBar, int fieldId) {
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
        swivl.test.application.viewmodel.UserListFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.includeLayoutProgressBar.setViewModel(viewModel);
        }
        executeBindingsOn(includeLayoutProgressBar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeLayoutProgressBar
        flag 1 (0x2L): handler
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}