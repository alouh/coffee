package com.youotech.coffee.data;

import com.youotech.coffee.bean.UserBean;

public interface UserRepository {
    UserBean findByUserName(String userName);

    void save(UserBean userBean);
}
