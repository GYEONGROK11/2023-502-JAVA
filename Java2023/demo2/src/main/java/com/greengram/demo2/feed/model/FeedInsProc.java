package com.greengram.demo2.feed.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class FeedInsProc {
    private int ifeed;
    private int iuser;
    private String contents;
    private String location;
    private List<String> pics;
}
