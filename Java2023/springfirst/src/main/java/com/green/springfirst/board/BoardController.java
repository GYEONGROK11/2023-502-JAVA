package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //빈등록 하면서 컨트롤러의 역할도 한다 (컨트롤러 : 요청시 응답함)
@RequiredArgsConstructor //생성자 만들기
public class BoardController {
    private final BoardService service;

    //@Autowired
    //private BoardService service;

    @GetMapping("/board/{iboard}")
    public BoardDetailVo getBoardDetail(@PathVariable int iboard){
        return service.getBoardById(iboard);
    }

    @GetMapping("/board")
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }
    //같은 주소값이라도 날리는 방식에 따라(get방식 post방식) 분기가능
    @PostMapping("/board")
    public int insBoard(){
        return 1;
    }
}
