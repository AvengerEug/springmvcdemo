package com.eugene.sumarry.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {


    @Value("${resources.user.name}")
    private String userName;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return userName;
    }

    @RequestMapping(value = "/test-view", method = RequestMethod.GET)
    public String testView() {
        return "test";
    }
}
