package com.green.greengram.feed;

import com.green.greengram.feed.model.FeedInsProcDto;
import com.green.greengram.feed.model.FeedPicInsProcDto;
import com.green.greengram.feed.model.FeedSelDto;
import com.green.greengram.feed.model.FeedSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface FeedMapper {
    int insFeed(FeedInsProcDto dto);
    int insFeedPic(FeedPicInsProcDto fDto);
    List<FeedSelVo> selFeed(FeedSelDto dto);
}
