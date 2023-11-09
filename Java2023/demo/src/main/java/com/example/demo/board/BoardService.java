package com.example.demo.board;

import com.example.demo.board.model.BoardInsDto;
import com.example.demo.board.model.BoardUpdDto;
import com.example.demo.board.model.BoradDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public int postBoard(BoardInsDto dto) {
        return mapper.insBoard(dto);
    }

    public List<BoradDto> selBoardList(BoradDto dto) {
        return mapper.selBoardList(dto);
    }

    public BoradDto selBoardById(int iboard){
        return mapper.selBoardById(iboard);
    }

    public int delBoard(int iboard){
        return mapper.delBoard(iboard);
    }

    public int updBoard(BoardUpdDto dto){
        return mapper.updBoard(dto);
    }
}

