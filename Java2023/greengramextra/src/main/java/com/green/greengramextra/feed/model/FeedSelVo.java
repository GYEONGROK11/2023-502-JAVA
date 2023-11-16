package com.green.greengramextra.feed.model;

import lombok.Data;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;

@Data
public class FeedSelVo {
    private int ifeed;
    private int iuser;
    private String nm;
    private String createdAt;
    private String contents;
    private String location;
    private List<String> pics;

}
