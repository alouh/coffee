package com.youotech.coffee.data.Impl;

import com.youotech.coffee.bean.CoffeeBean;
import com.youotech.coffee.bean.UserBean;
import com.youotech.coffee.data.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserRepositoryImpl implements UserRepository {

    private Map<String,UserBean> map = new HashMap<String, UserBean>();

    public UserBean findByUserName(String userName) {

        return map.get(userName);
    }

    public void save(UserBean userBean) {
        map.put(userBean.getUserName(),userBean);
    }
}
