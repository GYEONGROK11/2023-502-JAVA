package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVo {
    private int iboard;
    private String title;
    private String writer;
    private String createdAt;

    /*public void setCreated_at(String created_at) {
        this.createdAt = created_at;
    }*/  //생성자를 만들어주는 방법
}
