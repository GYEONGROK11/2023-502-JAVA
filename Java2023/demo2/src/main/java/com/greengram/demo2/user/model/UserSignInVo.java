package com.greengram.demo2.user.model;

import lombok.Data;

@Data
public class UserSignInVo {
    private int result;
    private int iuser;
    private String nm;
    private String createdAt;
    private String pic;
}
