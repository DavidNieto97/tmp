package com.web.controller.api;

import com.web.model.Project;
import org.springframework.web.bind.annotation.*;

/**
 * curl -X POST -d 'status=OPEN' -d 'description=Create a history board.' http://localhost:8080/api/v1/board/create
 * curl http://localhost:8080/api/v1/board/init
 */

@RestController
@RequestMapping("api/v1/board/")
public class BoardRestController
{
    @PostMapping("create")
    @ResponseBody
    public Project create(@ModelAttribute Project board)
    {
        return board;
    }

    @GetMapping("init")
    @ResponseBody
    public String init()
    {
        return "init application.";
    }
}
