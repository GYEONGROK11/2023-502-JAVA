package com.example.demo.board;

import com.example.demo.board.model.BoardInsDto;
import com.example.demo.board.model.BoardUpdDto;
import com.example.demo.board.model.BoradDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsDto dto);

    List<BoradDto> selBoardList(BoradDto dto);

    BoradDto selBoardById(int iboard);

    int delBoard(int iboard);

    int updBoard(BoardUpdDto dto);
}
