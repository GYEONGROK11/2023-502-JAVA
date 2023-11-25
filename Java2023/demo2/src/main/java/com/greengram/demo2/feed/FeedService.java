package com.greengram.demo2.feed;

import com.greengram.ResVo;
import com.greengram.demo2.feed.model.FeedInsDto;
import com.greengram.demo2.feed.model.FeedInsProc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;


    public int feedIns(FeedInsDto dto){
        FeedInsProc proc = FeedInsProc.builder()
                .contents(dto.getContents())
                .iuser(dto.getIuser())
                .pics(dto.getPics())
                .location(dto.getLocation())
                .build();
        int result1 = mapper.feedIns(proc);

        int result2 = mapper.feedInsPics(proc);

        return proc.getIfeed();
    }
}
