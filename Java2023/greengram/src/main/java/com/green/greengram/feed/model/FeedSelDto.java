package com.green.greengram.feed.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FeedSelDto {
    private int loginedIuser;  //로그인한 아이유저
    private int targetIuser;  //보고자하는 프로필 주인 아이유저
    private int startIdx;
    private int rowCount;
    /*private final int rowCount = 20;

    public FeedSelDto(int page){
        startIdx = (page - 1) * rowCount;
    }*/

}