package com.green.greengram.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSigninVo {
    private int result;  // 성공 1 아이디없음 2 비밀번호다름 3
    private int iuser;
    private String nm;
    private String upw;
    private String pic;

}
