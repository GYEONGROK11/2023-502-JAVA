package com.green.greengram.user;

import com.green.greengram.ResVo;
import com.green.greengram.user.model.UserDto;
import com.green.greengram.user.model.UserInsDto;
import com.green.greengram.user.model.UserSigninDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;


    public int postUserIns(UserInsDto dto) {
        return mapper.insUser(dto);
    }

    public List<UserDto> selUser() {

        return mapper.selUser();
    }

    public ResVo signin(UserSigninDto dto) {
        /*int result = 3;
        String savedUpw = mapper.selUserByUid(dto.getUid());
        if (savedUpw == null) {
            result = 2;
        } else if (savedUpw.equals(dto.getUpw())) {
            result = 1;
        }
        System.out.println("savedUpw : " + savedUpw);*/
        List<UserDto> udto= mapper.selUser();
            int result =2;
            for(UserDto a : udto){
                if(a.getUid().equals(dto.getUid()) && a.getUpw() .equals(dto.getUpw())){
                    result = 1;
                    new ResVo(result);
                } else if(a.getUid().equals(dto.getUid())&&!(a.getUpw() .equals(dto.getUpw()))){
                    result = 3;
                    new ResVo(result);
                }
            }
            System.out.println(result);
            return new ResVo(result);
        }
    }