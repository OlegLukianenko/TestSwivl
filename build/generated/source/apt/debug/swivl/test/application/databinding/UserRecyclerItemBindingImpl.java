package swivl.test.application.databinding;
import swivl.test.application.R;
import swivl.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserRecyclerItemBindingImpl extends UserRecyclerItemBinding implements swivl.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rounded_background, 3);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserRecyclerItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private UserRecyclerItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.view.View) bindings[3]
            );
        this.Temp.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new swivl.test.application.generated.callback.OnClickListener(this, 1);
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
        if (BR.data == variableId) {
            setData((swivl.test.application.data.retrofit.response.User) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((swivl.test.application.app.home.adapter.UserRecyclerAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable swivl.test.application.data.retrofit.response.User Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setAdapter(@Nullable swivl.test.application.app.home.adapter.UserRecyclerAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String dataLogin = null;
        swivl.test.application.data.retrofit.response.User data = mData;
        swivl.test.application.app.home.adapter.UserRecyclerAdapter adapter = mAdapter;
        java.lang.String dataAvatarUrl = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (data != null) {
                    // read data.login
                    dataLogin = data.login;
                    // read data.avatarUrl
                    dataAvatarUrl = data.avatarUrl;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.Temp, dataLogin);
            swivl.test.application.utils.BindingAdapters.setAvatar(this.image, dataAvatarUrl);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // adapter.userItemListListener != null
        boolean adapterUserItemListListenerJavaLangObjectNull = false;
        // adapter
        swivl.test.application.app.home.adapter.UserRecyclerAdapter adapter = mAdapter;
        // data
        swivl.test.application.data.retrofit.response.User data = mData;
        // adapter != null
        boolean adapterJavaLangObjectNull = false;
        // adapter.userItemListListener
        swivl.test.application.app.home.adapter.UserRecyclerAdapter.UserItemListListener adapterUserItemListListener = null;



        adapterJavaLangObjectNull = (adapter) != (null);
        if (adapterJavaLangObjectNull) {


            adapterUserItemListListener = adapter.userItemListListener;

            adapterUserItemListListenerJavaLangObjectNull = (adapterUserItemListListener) != (null);
            if (adapterUserItemListListenerJavaLangObjectNull) {



                adapterUserItemListListener.onUserItemClick(data);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): adapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}