package com.vsked.exam.application.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserTest {

    private static final Logger log = LoggerFactory.getLogger(LoginUserTest.class);

    @Test
    public void loginUserTest(){
        LoginUser loginUser=new LoginUser("sa","pa");
        log.info(loginUser.getUserName());
        log.info(loginUser.getUserPass());
        log.info(loginUser.toString());
        Assert.assertNotNull(loginUser);
        Assert.assertNotNull(loginUser.getUserName());
        Assert.assertNotNull(loginUser.getUserPass());
    }
}
