package com.green.greengramextra.feed;

import com.green.greengramextra.feed.model.FeedSelVo;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/feed")
public class FeedController {
    private final FeedService service;

    @GetMapping("/v1")
    public List<FeedSelVo> getFeedAllV1() {
        return service.getFeedAllV1();
    }
}
