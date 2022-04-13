package com.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController
{
    @GetMapping("/api")
    public String main(Model model)
    {
        return "Hello Api";
    }
}
