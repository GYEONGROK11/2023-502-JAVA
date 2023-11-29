package com.greengram.demo2.feed.model;

import lombok.Data;

import java.util.List;

@Data
public class FeedSelVo {
    private int ifeed;
    private String contents;
    private String location;
    private String createdAt;
    private int isFav;

    private int iuser;
    private String nm;
    private String pic;

    private List<String>pics;
    private List<FeedCommentSelVo> comments;
    private int isMoreComment;
}
