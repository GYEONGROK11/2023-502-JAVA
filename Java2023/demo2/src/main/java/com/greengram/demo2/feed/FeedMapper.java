package com.greengram.demo2.feed;

import com.greengram.demo2.feed.model.FeedInsDto;
import com.greengram.demo2.feed.model.FeedInsPicsDto;
import com.greengram.demo2.feed.model.FeedProcDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {
    int insFeed(FeedProcDto dto);

    int insFeedPic(FeedInsPicsDto dto);
}
