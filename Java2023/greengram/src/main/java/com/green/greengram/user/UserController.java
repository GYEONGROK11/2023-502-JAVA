package com.green.greengram.user;

import com.green.greengram.ResVo;
import com.green.greengram.user.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;

    @PostMapping
    public ResVo postUserIns(@RequestBody UserInsDto dto){
        ResVo result = service.insUser(dto);
        return result;
    }

    //1 아이디 비번 맞췄음, 2 아이디 없음, 3 비밀번호 틀림
    @PostMapping("/signin")
    public UserSigninVo login(@RequestBody UserSigninDto dto){
        return service.signin(dto);
    }

    @GetMapping
    public List<UserDto> seluser(){
        return service.selUser();
    }

    @GetMapping("/{targetIuser}")
    public UserProfileInfoVo getUserProfileInfo(@PathVariable int targetIuser){
        return service.getUserProfileInfo(targetIuser);
    }
}
