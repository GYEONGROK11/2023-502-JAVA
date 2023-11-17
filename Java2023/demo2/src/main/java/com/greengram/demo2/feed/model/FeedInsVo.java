package com.greengram.demo2.feed.model;

import lombok.Data;

import java.util.List;

@Data
public class FeedInsVo {
    private int ifeed;
    private int iuser;
    private String nm;
    private String contents;
    private String location;
    private String createdAt;
    private String updatedAt;
    private List<String> pics;
}
