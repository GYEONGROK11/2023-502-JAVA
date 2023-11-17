package com.greengram.demo2.feed.model;

import lombok.Data;

@Data
public class FeedProcDto {
    private int ifeed;
    private int iuser;
    private String contents;
    private String location;

    public FeedProcDto(FeedInsDto dto){
        this.iuser=dto.getIuser();
        this.contents=dto.getContents();
        this.location= dto.getLocation();
    }

}
