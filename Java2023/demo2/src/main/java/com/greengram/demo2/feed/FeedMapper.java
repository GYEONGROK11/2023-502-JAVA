package com.greengram.demo2.feed;

import com.greengram.demo2.feed.model.FeedInsDto;
import com.greengram.demo2.feed.model.FeedInsProc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedMapper {

    int feedIns(FeedInsProc dto);

    int feedInsPics(FeedInsProc dto);
}
