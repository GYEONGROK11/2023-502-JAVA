package com.greengram.demo2.user;


import com.greengram.demo2.user.model.UserInsDto;
import com.greengram.demo2.user.model.UserProcVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);

    UserProcVo login(String uid);

}
