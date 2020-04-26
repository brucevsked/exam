package com.vsked.common.model;

import com.vsked.common.model.Authorization;

public class Token implements Authorization {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
