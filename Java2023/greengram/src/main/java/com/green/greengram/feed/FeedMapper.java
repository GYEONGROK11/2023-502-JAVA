package com.green.greengram.feed;

import com.green.greengram.ResVo;
import com.green.greengram.feed.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface FeedMapper {
    int insFeed(FeedInsProcDto dto);
    List<FeedSelVo> selFeed(FeedSelDto dto);

    int insFeedPic(FeedPicInsProcDto fDto);
    List<FeedPicsVo> selFeedPics(List<Integer> p);

    int delFeedFav(FeedFavProcDto dto);
    int insFeedFav(FeedFavProcDto dto);
}
