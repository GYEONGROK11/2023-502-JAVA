package com.greengram.demo2.user;

import com.greengram.demo2.user.model.UserInsDto;
import com.greengram.demo2.user.model.UserProcVo;
import com.greengram.demo2.user.model.UserSignDto;
import com.greengram.demo2.user.model.UserSignVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;

    public int insUser(UserInsDto dto){

        return mapper.insUser(dto);
    }

    public UserSignVo login(UserSignDto dto){
        UserSignVo vo = new UserSignVo();
        vo.setResult(3);
        UserProcVo procVo = mapper.login(dto.getUid());
        if (procVo ==null){
            vo.setResult(2);
        }
        if(dto.getUpw().equals(procVo.getUpw())){
            vo.setResult(1);
            vo.setNm(procVo.getNm());
            vo.setPic(procVo.getPic());
            vo.setIuser(procVo.getIuser());
        }

        return vo;
    }
}
