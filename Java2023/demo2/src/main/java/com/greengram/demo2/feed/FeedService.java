package com.greengram.demo2.feed;

import com.greengram.ResVo;
import com.greengram.demo2.feed.model.FeedInsDto;
import com.greengram.demo2.feed.model.FeedInsPicsDto;
import com.greengram.demo2.feed.model.FeedProcDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;

    public ResVo insFeed(FeedInsDto dto){
        FeedProcDto procDto = new FeedProcDto(dto);
        int result1 = mapper.insFeed(procDto);

        FeedInsPicsDto picsDto = new FeedInsPicsDto(procDto.getIfeed(), dto.getPics());
        int result2 = mapper.insFeedPic(picsDto);
        return new ResVo(procDto.getIfeed());
    }
}
