package com.youotech.coffee.web;

import com.youotech.coffee.bean.CoffeeBean;
import com.youotech.coffee.data.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {

    private CoffeeRepository coffeeRepository;
    @Autowired
    public CoffeeController(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String coffee(long max,int count,Model model){
        model.addAttribute(coffeeRepository.findCoffee(max,count));
        return "coffee";
    }

    /*@RequestMapping(value = "/{coffeeId}",method = RequestMethod.GET)
    public String coffee(@PathVariable("coffeeId")long coffeeId,Model model){
        model.addAttribute(coffeeRepository.findOne(coffeeId));
        return "profile";
    }*/
}
