package com.green.greengram.user;


import com.green.greengram.user.model.UserDto;
import com.green.greengram.user.model.UserInsDto;


import com.green.greengram.user.model.UserSigninProcVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
    List<UserDto> selUser();
    UserSigninProcVo selUserByUid(String uid);
}
