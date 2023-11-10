package com.green.greengram.user.model;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class UserSigninDto {
    private String uid;
    private String upw;
}
