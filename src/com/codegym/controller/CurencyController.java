package com.codegym.controller;

import com.codegym.model.Usd;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurencyController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home", "usd", new Usd());
        return modelAndView;
    }
    @PostMapping("/usd")
    public ModelAndView login(@ModelAttribute("usd") Usd usd){

        if(!usd.checkUsd()){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("result");
            modelAndView.addObject("result", usd);
            return modelAndView;
        }
    }

}