package com.vsked.exam.application.model;

import org.apache.commons.lang3.Validate;

public class LoginUser {

    private String userName;
    private String userPass;

    public LoginUser(String userName,String userPass){
        Validate.notBlank(userName);
        Validate.notBlank(userPass);

        this.userName=userName;
        this.userPass=userPass;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserPass(){
        return userPass;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }
}
