package com.greengram.demo2.user;

import com.greengram.demo2.user.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserInfoVo userInfo(int targetIuser);

    int userSignUp(UserSignUpProcDto dto);

    UserSignInProcDto userSignIn(String uid);
}
