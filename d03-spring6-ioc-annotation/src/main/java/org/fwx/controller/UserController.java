package org.fwx.controller;

import org.fwx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserContorller
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 10:02
 * @Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void add(){
        System.out.println("UserContorller add...");
        userService.add();
    }
}
