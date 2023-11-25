package com.greengram.demo2.feed.model;

import lombok.Data;

@Data
public class FeedSelDto {
    private int rowCount;
    private int startIdx;
    private int loginedIuser;
    private int targetIuser;
}
