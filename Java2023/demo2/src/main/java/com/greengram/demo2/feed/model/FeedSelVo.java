package com.greengram.demo2.feed.model;

import lombok.Data;

@Data
public class FeedSelVo {
    private int ifeed;
    private int writerIuser;
    private String location;
    private String contents;
    private String writerPic;
    private int isFav;
}
