package com.green.greengram.user;


import com.green.greengram.ResVo;
import com.green.greengram.user.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;


    public ResVo insUser(UserInsDto dto) {
        int result = mapper.insUser(dto);
        return new ResVo(result);
    }

    public List<UserDto> selUser() {
        return mapper.selUser();
    }

    public UserProfileInfoVo getUserProfileInfo(int target){
        return mapper.selUserProfileInfo(target);
    }

    public UserSigninVo signin(UserSigninDto dto) {
        UserSigninVo vo = new UserSigninVo();
        vo.setResult(3);

        UserSigninProcVo procVo = mapper.selUserByUid(dto.getUid());
        if(procVo == null) {
            vo.setResult(2);
        } else if(procVo.getUpw().equals(dto.getUpw())) {
            vo.setIuser(procVo.getIuser());
            vo.setNm(procVo.getNm());
            vo.setPic(procVo.getPic());
            vo.setResult(1);
        }
        return vo;
        /*List<UserDto> udto= mapper.selUser();
            vo.setResult(2);
            for(UserDto a : udto){
                if(a.getUid().equals(dto.getUid()) && a.getUpw() .equals(dto.getUpw())){
                    vo.setResult(1);
                } else if(a.getUid().equals(dto.getUid())&&!(a.getUpw() .equals(dto.getUpw()))){
                    vo.setResult(3);
                }
            }*/
        }
    }