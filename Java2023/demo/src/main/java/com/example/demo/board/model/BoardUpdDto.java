package com.example.demo.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardUpdDto {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
}
