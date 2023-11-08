package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //빈등록하면 맵핑
public interface BoardMapper {
    List<BoardVo> selBoardList();

    BoardDetailVo selBoardById(int iboard);
}
