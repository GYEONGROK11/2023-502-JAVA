package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor //생성자 만들기
public class BoardController {
    private final BoardService service;
    //@Autowired
    //private BoardService service;

    @GetMapping("/board")
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }

}
