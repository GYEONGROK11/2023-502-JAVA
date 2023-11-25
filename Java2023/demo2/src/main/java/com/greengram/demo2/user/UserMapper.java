package com.greengram.demo2.user;

import com.greengram.demo2.user.model.UserSignInDto;
import com.greengram.demo2.user.model.UserSignInProc;
import com.greengram.demo2.user.model.UserSignInVo;
import com.greengram.demo2.user.model.UserSignUpDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    int userSignUp(UserSignUpDto dto);

    UserSignInProc userSignIn(String uid);
}
