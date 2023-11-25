package com.greengram.demo2.user.model;

import lombok.Data;

@Data
public class UserSignInProc {
    private String upw;
    private String uid;
    private int result;
    private int iuser;
    private String nm;
    private String createdAt;
    private String pic;

}
