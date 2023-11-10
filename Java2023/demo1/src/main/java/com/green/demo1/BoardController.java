package com.green.demo1;


import com.green.demo1.model.BoardDto;
import com.green.demo1.model.BoardInsDto;
import com.green.demo1.model.BoardUpdDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @PostMapping("/board")
    int insBorad(@RequestBody BoardInsDto dto){
        return service.insBoard(dto);
    }

    @GetMapping("/board")
    List<BoardDto> selBoardList(){
        return service.selBoardList();
    }

    @GetMapping("/board/{iboard}")
    BoardDto selBoardId(@PathVariable int iboard){
        return service.selBoardId(iboard);
    }

    @DeleteMapping("/board/{iboard}")
    int delBoard(@PathVariable int iboard){
        return service.delBoard(iboard);
    }

    @PutMapping("/board")
    int updBoard(@RequestBody BoardUpdDto dto){
        return service.updBoard(dto);
    }


}
