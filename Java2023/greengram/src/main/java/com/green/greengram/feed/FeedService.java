package com.green.greengram.feed;

import com.green.greengram.ResVo;
import com.green.greengram.feed.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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

    public ResVo procFav(FeedFavProcDto dto){
            //1 있는지 없는지 확인
            int result = mapper.delFeedFav(dto);
            if (result == 0){
                return new ResVo(mapper.insFeedFav(dto));
            }
            //2 있으면 딜리트 없으면 인설트
        return new ResVo(2);

    }
    /*public List<FeedSelVo> getFeed(int page){
        FeedSelDto dto = new FeedSelDto(page);
        return mapper.selFeed(dto);
    }*/


    public List<FeedSelVo> getFeed(int page, int iuser){
        final int ROW_COUNT = 5;
        FeedSelDto dto = FeedSelDto.builder() // 빌더패턴 : 값넣기 편함, 원하는 것에 넣을 수 있음, 생성자로도 가능 생성자는 순서 맞춰야됨
                .iuser(iuser)
                .startIdx((page - 1) * ROW_COUNT)
                .rowCount(ROW_COUNT)
                .build();
        List<FeedSelVo> feedSelVoList = mapper.selFeed(dto);

        List<Integer> iFeedList = new ArrayList<>();
        HashMap<Integer, FeedSelVo> feedMap = new HashMap();
        // 해시맵<키값, 밸류값>
        for(FeedSelVo vo : feedSelVoList){
            iFeedList.add(vo.getIfeed());
            feedMap.put(vo.getIfeed(), vo);
            //해시맵<ifeed pk값, vo주소값>
        }
        if(iFeedList.size() > 0) {
            List<FeedPicsVo> feedPicsList = mapper.selFeedPics(iFeedList);

            for (FeedPicsVo vo : feedPicsList) {
                FeedSelVo feedVo = feedMap.get(vo.getIfeed());
                feedVo.getPics().add(vo.getPic());
            }
        }
        return feedSelVoList;
    }

}
