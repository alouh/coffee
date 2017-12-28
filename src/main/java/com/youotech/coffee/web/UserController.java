package com.youotech.coffee.web;

import com.youotech.coffee.bean.UserBean;
import com.youotech.coffee.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    /*@RequestMapping(method = RequestMethod.GET)
    public String made(){
        return "registerForm";
    }*/

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public String showUserProfile(@PathVariable String userName, Model model){
        UserBean userBean = userRepository.findByUserName(userName);
        model.addAttribute(userBean);
        return "profile";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegistrationForm(Model model){

        model.addAttribute(new UserBean());

        return "registerForm";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String processRegistration(@Valid UserBean userBean, Errors errors){

        if (errors.hasErrors()){
            System.out.println("b" + errors);
            return "registerForm";
        }

        userRepository.save(userBean);

        return "redirect:/user/" + userBean.getUserName();
    }
}
