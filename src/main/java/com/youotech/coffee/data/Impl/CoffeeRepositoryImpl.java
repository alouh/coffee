package com.youotech.coffee.data.Impl;

import com.youotech.coffee.bean.CoffeeBean;
import com.youotech.coffee.data.CoffeeRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class CoffeeRepositoryImpl implements CoffeeRepository {

    public List<CoffeeBean> findCoffee(long max, int count) {
        List<CoffeeBean> list = new ArrayList<CoffeeBean>();
        for (int i = 0;i < count;i ++){
            list.add(new CoffeeBean("coffee" + i,new Date()));
        }
        return list;
    }

    public CoffeeBean findOne(long id) {
        return new CoffeeBean("coffee" + id,new Date());
    }
}
