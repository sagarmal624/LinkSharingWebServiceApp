package com.yakkaytech.linkSharing.controller;

import com.yakkaytech.linkSharing.domain.User;
import com.yakkaytech.linkSharing.services.UserService;
import com.yakkaytech.linkSharing.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RequestMapping("/user")
@RestController
public class UserController {
    @Value("${spring.messages.basename}")
    private String basename;
    @Autowired
    private MessageSource messageSource;
    @Autowired
    UserService userService;

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDTO save(@ModelAttribute("user") User user) {

        System.out.println(basename);
        System.out.println(messageSource.getMessage("message.welecome",null, Locale.US));
        return userService.save(user);
    }
    @GetMapping("/get/{id}")
    public ResponseDTO get(@PathVariable("id") Integer id) {
        return userService.get(id);
    }

}
