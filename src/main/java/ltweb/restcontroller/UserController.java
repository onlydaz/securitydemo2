package ltweb.restcontroller;


import org.springframework.web.bind.annotation.*;

import ltweb.entity.UserInfo;
import ltweb.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/new")
    public String addUser(@RequestBody UserInfo userInfo) {
        return userService.addUser(userInfo);
    }
}
