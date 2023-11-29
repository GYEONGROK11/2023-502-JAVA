package com.greengram.demo2.user.model;

import lombok.Data;

@Data
public class UserInfoVo {
    private int feedCnt;
    private int isFav;
    private String nm;
    private String pic;
    private String createdAt;
}
