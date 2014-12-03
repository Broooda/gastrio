package com.io.gastrIO.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.io.gastrIO.form.RegisterForm;
import com.io.gastrIO.service.IRoleService;
import com.io.gastrIO.service.IUserService;

@Controller
public class RegisterController {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/add_user",  method = RequestMethod.GET)
    public String addUser(final Model model, @ModelAttribute final RegisterForm registerForm) {
        return "add_user";
    }

    @RequestMapping(value = "/register",  method = RequestMethod.POST)
    public String saveUser(final Model model, @ModelAttribute final RegisterForm registerForm) {
        return "login";
    }

}