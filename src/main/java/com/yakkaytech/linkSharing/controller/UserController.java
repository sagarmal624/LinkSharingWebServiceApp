package com.yakkaytech.linkSharing.controller;

import com.yakkaytech.linkSharing.domain.User;
import com.yakkaytech.linkSharing.services.UserService;
import com.yakkaytech.linkSharing.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO save(@ModelAttribute("userDetails") User userDetails) {
        return userService.save(userDetails);
    }

}
