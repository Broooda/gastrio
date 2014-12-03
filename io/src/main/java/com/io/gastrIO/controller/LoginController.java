package com.io.gastrIO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.io.gastrIO.service.IRoleService;


@Controller
public class LoginController {

    @Autowired
    private IRoleService roleService;

    private static final String LOGIN_PAGE = "login";

    private static final String REGISTER_PAGE = "register";

    private static final String MAIN_PAGE = "main";


    /**
     * Obsługa GET dla strony logowania.
     *
     * @return widok strony logowania.
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return LOGIN_PAGE;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String main(final Model model) {
        return MAIN_PAGE;
    }


    /**
     * Obsługa błędu podczas logowania.
     *
     * @param model model - przekazujemy poprzez niego informacje o b��dnym logowaniu.
     * @return widok strony logowania
     */
    @RequestMapping("/login-error")
    public String loginError(final Model model) {
        model.addAttribute("loginError", true);
        return LOGIN_PAGE;
    }

    @RequestMapping("/logout")
    public String logout(final Model model) {

        return LOGIN_PAGE;
    }

}