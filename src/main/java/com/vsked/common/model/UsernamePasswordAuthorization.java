package com.vsked.common.model;

import com.vsked.common.model.Authorization;

public class UsernamePasswordAuthorization implements Authorization {

    private String username;
    private String password;

    public UsernamePasswordAuthorization(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
