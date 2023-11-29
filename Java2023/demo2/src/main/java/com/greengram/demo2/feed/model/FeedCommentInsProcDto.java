package com.greengram.demo2.feed.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FeedCommentInsProcDto {
    private int ifeedComment;
    private int iuser;
    private int ifeed;
    private String comment;
    private String pic;
}
