package swivl.test.application.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public abstract class BaseFragment <T extends ViewDataBinding> extends Fragment {

    protected T binding;
    Context mContext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayout(), container, false);
        setStartViewState();
        return binding.getRoot();
    }

    protected abstract int getLayout();

    protected void showToast(String text, int length) {
        if (mContext != null)
            Toast.makeText(mContext, text, length).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    protected void setStartViewState() {
    }
}
