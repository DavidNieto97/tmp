package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/task/")
public class TaskController
{
    @GetMapping("/main")
    public String main(Model model)
    {
        return "main";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        return "index";
    }

}



