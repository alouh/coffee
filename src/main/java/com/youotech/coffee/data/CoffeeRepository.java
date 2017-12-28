package com.youotech.coffee.data;

import com.youotech.coffee.bean.CoffeeBean;

import java.util.List;

public interface CoffeeRepository {
    List<CoffeeBean> findCoffee(long max, int count);

    CoffeeBean findOne(long id);
}
