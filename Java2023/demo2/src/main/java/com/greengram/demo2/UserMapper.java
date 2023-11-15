package com.greengram.demo2;


import com.greengram.demo2.model.UserInsDto;
import com.greengram.demo2.model.UserProcVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);

    UserProcVo login(String uid);

}
