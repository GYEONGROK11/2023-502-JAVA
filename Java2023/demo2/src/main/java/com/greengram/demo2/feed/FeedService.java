package com.greengram.demo2.feed;

import com.greengram.ResVo;
import com.greengram.demo2.feed.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedService {
   private final FeedMapper mapper;


   public List<FeedSelVo> feedAllSel(FeedSelDto dto){
      List<FeedSelVo> list = mapper.feedAllSel(dto);

      for (FeedSelVo vo: list) {
         List<String> pics = mapper.feedSelPic(vo.getIfeed());
         vo.setPics(pics);
         FeedCommentSelProcDto dto1 = FeedCommentSelProcDto.builder()
                 .ifeed(vo.getIfeed())
                 .startIdx(0)
                 .rowCount(4)
                 .build();

         List<FeedCommentSelVo> comments = mapper.feedCommentSel(dto1);
         if(comments.size() ==4){
            vo.setIsMoreComment(1);
            comments.remove(comments.size()-1);
         }
         vo.setComments(comments);
      }
      return list;
   }

   public List<FeedCommentSelVo> feedCommentSel(FeedCommentSelProcDto pDto){

      return mapper.feedCommentSel(pDto);
   }

   public ResVo feedIns(FeedInsDto dto){
      FeedInsProcDto pdto = FeedInsProcDto.builder()
              .iuser(dto.getIuser())
              .contents(dto.getContents())
              .location(dto.getLocation())
              .pics(dto.getPics())
              .build();
      mapper.feedIns(pdto);
      mapper.feedInsPic(pdto);
      return new ResVo(pdto.getIfeed());
   }

   public ResVo feedFav(FeedDto dto){
      int result = mapper.feedDelFav(dto);

      if (result == 0){
         mapper.feedInsFav(dto);
         return new ResVo(1);
      }
      return new ResVo(0);
   }

   public ResVo feedComment(FeedCommentInsDto dto){
      FeedCommentInsProcDto pdto = FeedCommentInsProcDto.builder()
              .iuser(dto.getIuser())
              .ifeed(dto.getIfeed())
              .comment(dto.getComment())
              .pic(dto.getPic())
              .build();
      mapper.feedComment(pdto);
      return new ResVo(pdto.getIfeedComment());
   }

   public ResVo feedDel(FeedDto dto){
      Integer result = mapper.selFeedIuser(dto);
      if(result == null){
         return new ResVo(0);
      }
      mapper.feedCommentDel(dto);
      mapper.feedPicDel(dto);
      mapper.feedFavDel(dto);
      mapper.feedDel(dto);
      return new ResVo(1);
   }

   public ResVo feedDelComment(FeedCommentDelDto dto){
      int result = mapper.feedDelComment(dto);
      return new ResVo(result);
   }

}
