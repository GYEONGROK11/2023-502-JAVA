package com.greengram.demo2.user;

import com.greengram.ResVo;
import com.greengram.demo2.user.model.*;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class UserService {
   private final UserMapper mapper;

    public UserInfoVo userInfo(int targetIuser){
        return mapper.userInfo(targetIuser);
    }

    public ResVo userSignUp(UserSignUpDto dto){
        String hashedPw = BCrypt.hashpw(dto.getUpw(),BCrypt.gensalt());

        UserSignUpProcDto procDto = UserSignUpProcDto.builder()
                .uid(dto.getUid())
                .upw(hashedPw)
                .nm(dto.getNm())
                .pic(dto.getPic())
                .build();
        int result = mapper.userSignUp(procDto);
        return new ResVo(procDto.getIuser());
    }

    public UserSignInVo userSignIn(UserSignInDto dto){
        UserSignInProcDto procDto = mapper.userSignIn(dto.getUid());
        UserSignInVo vo = new UserSignInVo();
        if(procDto == null){
            vo.setResult(2);
            return vo;
        }
        String savedPw = procDto.getUpw(); //DB에서 가져온 비밀번호
        boolean comparedPw = BCrypt.checkpw(dto.getUpw(), savedPw);
        if(comparedPw){
            vo.setResult(1);
            vo.setIuser(procDto.getIuser());
            vo.setNm(procDto.getNm());
            vo.setPic(procDto.getPic());
        } else {
            vo.setResult(3);
        }
        return vo;
    }
}
