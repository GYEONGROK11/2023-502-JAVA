package com.green.demo1;

import com.green.demo1.model.BoardDto;
import com.green.demo1.model.BoardInsDto;
import com.green.demo1.model.BoardUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    int insBoard(BoardInsDto dto){
        return mapper.insBoard(dto);
    }

    List<BoardDto> selBoardList(){
        return mapper.selBoardList();
    }

    BoardDto selBoardId(int iboard){
        return mapper.selBoardId(iboard);
    }

    int delBoard(int iboard){
        return mapper.delBoard(iboard);
    }

    int updBoard(BoardUpdDto dto){
        return mapper.updBoard(dto);
    }
}
