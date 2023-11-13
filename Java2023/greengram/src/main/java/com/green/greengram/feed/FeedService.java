package com.green.greengram.feed;

import com.green.greengram.ResVo;
import com.green.greengram.feed.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;

    public ResVo insFeed(FeedInsDto dto) {
        FeedInsProcDto pDto = new FeedInsProcDto(dto);
        int result = mapper.insFeed(pDto);
        FeedPicInsProcDto fDto = new FeedPicInsProcDto(pDto.getIfeed(), dto.getPics());
        int result2 =mapper.insFeedPic(fDto);
        return new ResVo(pDto.getIfeed());
    }
    public List<FeedSelVo> getFeed(int page){
        final int ROW_COUNT = 20;
        FeedSelDto dto = FeedSelDto.builder()
                .startIdx((page - 1) * ROW_COUNT)
                .rowCount(ROW_COUNT)
                .build();
        List<FeedSelVo> result = mapper.selFeed(dto);
        return result;
    }
}
