package com.green.greengram.feed.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
//@AllArgsConstructor
public class FeedPicInsProcDto {
    private int ifeed;
    private List<String> pics;

    public FeedPicInsProcDto(int ifeed, List<String> pics){
        this.ifeed = ifeed;
        this.pics = pics;
    }
}
