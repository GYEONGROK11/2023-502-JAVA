package com.green.greengramextra.feed;

import com.green.greengramextra.feed.model.FeedSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {

    List<FeedSelVo> selFeedAll();

    List<String> selFeedPicsAll(int ifeed);
}
