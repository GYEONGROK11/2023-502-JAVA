package com.green.demo1;

import com.green.demo1.model.BoardDto;
import com.green.demo1.model.BoardInsDto;
import com.green.demo1.model.BoardUpdDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsDto dto);

    List<BoardDto> selBoardList();

    BoardDto selBoardId(int iboard);

    int delBoard(int iboard);

    int updBoard(BoardUpdDto dto);
}
