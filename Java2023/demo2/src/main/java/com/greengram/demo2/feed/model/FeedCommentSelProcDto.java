package com.greengram.demo2.feed.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class FeedCommentSelProcDto {
    private int ifeed;
    private int startIdx;
    private int rowCount;

}
