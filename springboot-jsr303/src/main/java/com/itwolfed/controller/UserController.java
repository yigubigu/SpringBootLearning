package com.itwolfed.controller;

import com.itwolfed.entity.User;
import com.itwolfed.utils.Result;
import com.itwolfed.valid.Groups;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public Result save(@Validated(Groups.Add.class) @RequestBody User user)  {
        return Result.ok();
    }

}
