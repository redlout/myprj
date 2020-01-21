package com.trpg.myprj.web;

import com.trpg.myprj.entity.User;
import com.trpg.myprj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @ResponseBody
    @PostMapping("/login")
    private User loginUser(@RequestBody User user){
        return userService.login(user);
    }
}
