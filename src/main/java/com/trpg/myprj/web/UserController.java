package com.trpg.myprj.web;

import com.trpg.myprj.entity.User;
import com.trpg.myprj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    private Map<String, Object> addFxRole(@RequestBody User user){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userService.addUser(user));
        return modelMap;
    }
}
