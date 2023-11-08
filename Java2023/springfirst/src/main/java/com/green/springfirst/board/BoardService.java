package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service//빈등록 하면서 서비스 역할도 함
@RequiredArgsConstructor //  밑의/*/를 대신해줌
public class BoardService {

    private final BoardMapper mapper;

    /*@Autowired
    public BoardService(BoardMapper mapper){
        this.mapper = mapper;
    }*/

    public List<BoardVo> getBoard(){
        return mapper.selBoardList();
    }

    public BoardDetailVo getBoardById(int iboard){
        return mapper.selBoardById(iboard);
    }

}
