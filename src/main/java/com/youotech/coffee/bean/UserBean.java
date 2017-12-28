package com.youotech.coffee.bean;

import javax.validation.constraints.Size;

public class UserBean {

    @Size(min = 1,max = 5,message = "{firstName.size}")
    private String firstName;

    @Size(min = 1,max = 5,message = "{lastName.size}")
    private String lastName;

    @Size(min = 2,max = 10,message = "{userName.size}")
    private String userName;

    @Size(min = 6,max = 20,message = "{password.size}")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
