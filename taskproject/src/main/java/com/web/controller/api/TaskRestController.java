package com.web.controller.api;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRestController
{
    @GetMapping("/api")
    public String main(Model model)
    {
        return "Hello Api";
    }
}
