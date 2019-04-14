package swivl.test.application.app.home.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import swivl.test.application.R;
import swivl.test.application.app.home.adapter.viewholder.UserViewHolder;
import swivl.test.application.base.BaseRecyclerAdapter;
import swivl.test.application.data.retrofit.response.User;
import swivl.test.application.databinding.UserRecyclerItemBinding;

public class UserRecyclerAdapter extends BaseRecyclerAdapter<UserRecyclerItemBinding, User, UserViewHolder> {


    public UserItemListListener userItemListListener;

    @Inject
    public UserRecyclerAdapter(UserItemListListener listener) {
        this.userItemListListener = listener;
    }

    @Override
    protected UserRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.user_recycler_item, parent, false);
    }

    @Override
    protected UserViewHolder getViewHolder(UserRecyclerItemBinding binding) {
        binding.setAdapter(this);
        return new UserViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }



    public interface UserItemListListener {
        void onUserItemClick(User user);
    }
}