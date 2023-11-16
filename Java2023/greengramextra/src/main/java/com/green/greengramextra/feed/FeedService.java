package com.green.greengramextra.feed;

import com.green.greengramextra.feed.model.FeedSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;

    public List<FeedSelVo> getFeedAllV1(){
        List<FeedSelVo> list = mapper.selFeedAll();

        for (FeedSelVo item : list){
            List<String> pics = mapper.selFeedPicsAll(item.getIfeed());
            item.setPics(pics);
        }

        return list;
    }

}
