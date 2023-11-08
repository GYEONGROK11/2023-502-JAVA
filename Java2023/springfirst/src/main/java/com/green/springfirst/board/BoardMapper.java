package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //빈등록하면 맵핑
public interface BoardMapper {
    int insBoard(BoardInsDto dto);

    int delBoard(int iboard);

    int updBoard(BoardUpdDto updVo);

    List<BoardVo> selBoardList();

    BoardDetailVo selBoardById(int iboard);
}
