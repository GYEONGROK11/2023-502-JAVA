package com.greengram.demo2.user;

import com.greengram.ResVo;
import com.greengram.demo2.user.model.UserSignInDto;
import com.greengram.demo2.user.model.UserSignInProc;
import com.greengram.demo2.user.model.UserSignInVo;
import com.greengram.demo2.user.model.UserSignUpDto;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;

    public int userSignUp(UserSignUpDto dto){
        String hashedPw = BCrypt.hashpw(dto.getUpw(),BCrypt.gensalt());
        dto.setUpw(hashedPw);

        return mapper.userSignUp(dto);
    }

    public UserSignInVo userSignIn(UserSignInDto dto){
        UserSignInVo vo = new UserSignInVo();
        UserSignInProc proc = mapper.userSignIn(dto.getUid());
        vo.setResult(2);
        String savedPw = proc.getUpw();
        boolean comparedPw = BCrypt.checkpw(dto.getUpw(), savedPw);
        if(comparedPw){
            vo.setResult(1);
            vo.setNm(proc.getNm());
            vo.setPic(proc.getPic());
            vo.setCreatedAt(proc.getCreatedAt());
            vo.setIuser(proc.getIuser());
        } else {vo.setResult(3);}

        return vo;
    }
}
