package com.green.growgreen.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UserInsDto {
    @JsonIgnore
    private int iuser;

    private String nm;

    private String uid;
    private String upw;
}
