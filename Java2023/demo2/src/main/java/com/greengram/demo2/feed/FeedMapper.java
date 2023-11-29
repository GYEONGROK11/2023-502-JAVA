package com.greengram.demo2.feed;

import com.greengram.demo2.feed.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {
    List<FeedSelVo> feedAllSel(FeedSelDto dto);

    List<FeedCommentSelVo> feedCommentSel(FeedCommentSelProcDto dto);

    List<String> feedSelPic(int ifeed);

    int feedIns(FeedInsProcDto dto);

    int feedInsPic(FeedInsProcDto dto);

    int feedDelFav(FeedDto dto);

    int feedDelComment(FeedCommentDelDto dto);

    int feedInsFav(FeedDto dto);

    int feedComment(FeedCommentInsProcDto dto);

    Integer selFeedIuser(FeedDto dto);

    int feedDel(FeedDto dto);

    int feedCommentDel(FeedDto dto);

    int feedFavDel(FeedDto dto);

    int feedPicDel(FeedDto dto);
}
