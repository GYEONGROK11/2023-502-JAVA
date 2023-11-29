package com.greengram.demo2.feed.model;

import lombok.Data;

@Data
public class FeedCommentSelVo {
    private int ifeedComment;
    private String comment;
    private String createdAt;
    private int iuser;
    private String nm;
    private String pic;
}
