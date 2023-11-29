package com.greengram.demo2.user;


import com.greengram.ResVo;
import com.greengram.demo2.user.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
   private final UserService service;

   @GetMapping
   public UserInfoVo userInfo(int targetIuser){
       return service.userInfo(targetIuser);
   }

   @PostMapping("/signup")
   public ResVo usersignUp(@RequestBody UserSignUpDto dto){
       return service.userSignUp(dto);
   }

   @PostMapping("/signin")
   public UserSignInVo userSignIn(@RequestBody UserSignInDto dto){
        return service.userSignIn(dto);
   }
}
