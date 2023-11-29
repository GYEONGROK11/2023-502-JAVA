package com.greengram.demo2.user.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserSignUpProcDto {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private String pic;
}
