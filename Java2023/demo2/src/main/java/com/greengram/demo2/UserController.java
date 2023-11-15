package com.greengram.demo2;

import com.greengram.ResVo;
import com.greengram.demo2.model.UserInsDto;
import com.greengram.demo2.model.UserSignDto;
import com.greengram.demo2.model.UserSignVo;
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
