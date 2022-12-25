package com.nets.productorder.userinfo.controller;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class UserController {

    /*
    @Autowired
    private UserService service;
    */

    private static String encrypt(String userName, String password) {
        int index = userName.trim().length();
        String salt = userName.trim().charAt(index > 5 ? index - 4 : 0) + "";
        return new Md5Hash(password.trim(), salt).toString();
    }

}
