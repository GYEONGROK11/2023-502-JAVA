package com.green.greengram.feed.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FeedInsProcDto {
    private int ifeed;  //박스갈이한 이유 ifeed pk는 레코드가 저장될때 주어진다    스웨거 - 처음보낼때 ifeed가 있어야됨
                        //그 작업에 필요한 애들만 사용 (정규화개념으로 쪼개서 사용)
    private int iuser;
    private String contents;
    private String location;

    public FeedInsProcDto(FeedInsDto dto){
        this.iuser =dto.getIuser();
        this.contents = dto.getContents();
        this.location = dto.getLocation();
    }
}
