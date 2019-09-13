package com.xby2.team1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value = "/")
    public String index() {
        return "You've reached this simple Spring app. Not much to see. This is the root. That's it folks.";
    }

}
