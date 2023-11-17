package com.greengram.demo2.feed.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FeedInsPicsDto {
    private int ifeed;
    private List<String> pics;
}
