package com.example.demoServer.controller;

//import com.example.demoServer.model.UserRequest;
//import com.example.demoServer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class TestController {

//    @Autowired
//    UserService userService;
    private static final Logger logger = Logger.getLogger(TestController.class.getName());
    @GetMapping("/hello")
    public String test() {
        return "Hello World!";
    }

//    @PostMapping("/submit")
//    public String submit(@RequestBody UserRequest userRequest) {
//        userService.saveUser();
//        return "Message is Submitted!";
//    }


}
