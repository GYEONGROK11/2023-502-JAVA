package com.greengram.demo2.feed;

import com.greengram.ResVo;
import com.greengram.demo2.feed.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/feed")
public class FeedController {
    private final FeedService service;

    @GetMapping
    public List<FeedSelVo> feedAllSel(int page, int loginedIuser
                                , @RequestParam(required = false,defaultValue = "0")int targetIuser) {
        final int ROW_COUNT = 20;
        FeedSelDto dto = FeedSelDto.builder()
                .startIdx((page-1)*ROW_COUNT)
                .rowCount(ROW_COUNT)
                .loginedIuser(loginedIuser)
                .targetIuser(targetIuser)
                .build();

        return service.feedAllSel(dto);
    }



    @GetMapping("/comment")
    public List<FeedCommentSelVo> feedCommentSel(int ifeed){
        FeedCommentSelProcDto pDto = FeedCommentSelProcDto.builder()
                .ifeed(ifeed)
                .startIdx(4)
                .rowCount(9999)
                .build();

        return service.feedCommentSel(pDto);
    }


    @PostMapping
    public ResVo feedIns(@RequestBody FeedInsDto dto){
        return service.feedIns(dto);
    }

    @PostMapping("/fav")
    public ResVo feedFav(@RequestBody FeedDto dto){
        return service.feedFav(dto);

    }

    @PostMapping("/comment")
    public ResVo feedComment(@RequestBody FeedCommentInsDto dto){
        return service.feedComment(dto);
    }

    @DeleteMapping
    public ResVo feedDel(@RequestBody FeedDto dto){
        return service.feedDel(dto);
    }

    @DeleteMapping("/comment")
    public ResVo feedCommentDel(@RequestBody FeedCommentDelDto dto){
        return service.feedDelComment(dto);
    }



}
