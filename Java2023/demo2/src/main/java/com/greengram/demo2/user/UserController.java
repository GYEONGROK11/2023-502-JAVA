package com.greengram.demo2.user;


import com.greengram.ResVo;
import com.greengram.demo2.user.model.UserSignInDto;
import com.greengram.demo2.user.model.UserSignInVo;
import com.greengram.demo2.user.model.UserSignUpDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;

    @PostMapping("/signup")
    public ResVo userSignUp(@RequestBody UserSignUpDto dto){

        return new ResVo(service.userSignUp(dto));
    }

    @PostMapping
    public UserSignInVo userSignIn(@RequestBody UserSignInDto dto){
        return service.userSignIn(dto);
    }
}
