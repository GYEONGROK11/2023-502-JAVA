package com.greengram.demo2.feed;

import com.greengram.ResVo;
import com.greengram.demo2.feed.model.FeedInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/feed")
public class FeedController {
    private final FeedService service;

    @PostMapping
    public ResVo feedIns(FeedInsDto dto){

        return new ResVo(service.feedIns(dto));
    }


}
