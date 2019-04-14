package swivl.test.application.app.home.adapter.viewholder;

import swivl.test.application.base.BaseViewHolder;
import swivl.test.application.data.retrofit.response.User;
import swivl.test.application.databinding.UserRecyclerItemBinding;

public class UserViewHolder extends BaseViewHolder <UserRecyclerItemBinding, User>{

    public UserViewHolder(UserRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(User item) {
        getBinding().setData(item);
    }
}
