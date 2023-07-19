package com.dailycondebuffer.springbootdemo.controller;

import com.dailycondebuffer.springbootdemo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "hello world!";
    }
    @GetMapping("/user")
    public User user(@PathVariable String id) {
        User user = new User();
        user.setId("1");
        user.setName("Raja");
        user.setEmailid("rajasekhar1500@gmail.com");
        return user;
    }
    @GetMapping("/{id}/{id1}")
    public String pathVariable(@PathVariable String id,
                               @PathVariable("id1") String name) {
        return "The path variable is : "+id+" "+name;

    }
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,
                                @RequestParam(value = "email", required = false,defaultValue = "") String emailId) {
        return "Your name is " +name+" and email id is: "+emailId;
    }
}
