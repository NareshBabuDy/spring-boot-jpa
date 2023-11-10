package com.codewithsanjay.springbootjpa.Controller;

import com.codewithsanjay.springbootjpa.Service.AppUserService;
import com.codewithsanjay.springbootjpa.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping("/login")
    private AppUser login(@RequestBody AppUser appUser) {
        return appUserService.login(appUser);
    }

    @PostMapping("/register")
    private AppUser register(@RequestBody AppUser appUser) {
        return appUserService.register(appUser);
    }

}
