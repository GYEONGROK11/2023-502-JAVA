package com.greengram.demo2;

import com.greengram.demo2.model.UserInsDto;
import com.greengram.demo2.model.UserProcVo;
import com.greengram.demo2.model.UserSignDto;
import com.greengram.demo2.model.UserSignVo;
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
        if(procVo == null){
            vo.setResult(2);
        }
        else if(procVo.getUpw().equals(dto.getUpw())){
            vo.setResult(1);
            vo.setNm(procVo.getNm());
            vo.setPic(procVo.getPic());
            vo.setIuser(procVo.getIuser());
        }
        return vo;
    }
}
