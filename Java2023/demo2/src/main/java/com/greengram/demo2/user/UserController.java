package com.greengram.demo2.user;

import com.greengram.ResVo;
import com.greengram.demo2.user.model.UserInsDto;
import com.greengram.demo2.user.model.UserSignDto;
import com.greengram.demo2.user.model.UserSignVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;

    @PostMapping
    public ResVo insUser(@RequestBody UserInsDto dto){
        int result = service.insUser(dto);
        return new ResVo(result);
    }

    @PostMapping("/signin")
    public UserSignVo login(@RequestBody UserSignDto dto){
        return service.login(dto);
    }



}
