package com.greengram.demo2.user.model;

import lombok.Data;

@Data
public class UserSignInProcDto {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private String pic;
}
