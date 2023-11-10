package com.green.greengram.user.model;

import lombok.Data;
import lombok.Getter;

@Data
public class UserInsDto {
    private String uid;
    private String upw;
    private String nm;
    private String pic;
}
