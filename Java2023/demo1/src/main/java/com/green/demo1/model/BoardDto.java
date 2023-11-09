package com.green.demo1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAt;
}
