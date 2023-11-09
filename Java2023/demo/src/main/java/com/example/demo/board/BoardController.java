package com.example.demo.board;

import com.example.demo.board.model.BoardInsDto;
import com.example.demo.board.model.BoardUpdDto;
import com.example.demo.board.model.BoradDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @PostMapping("/board")
    @ResponseBody
    public int postBoard(@RequestBody BoardInsDto dto){
        return service.postBoard(dto);
    }

    @GetMapping("/board")
    public List<BoradDto> selBoardList(BoradDto dto){
        return service.selBoardList(dto);
    }

    @GetMapping("/board/{iboard}")
    public BoradDto selBoardById(@PathVariable int iboard){
        return service.selBoardById(iboard);
    }

    @DeleteMapping("/board/{iboard}")
    public int delBoard(@PathVariable int iboard){
        return service.delBoard(iboard);
    }

    @PutMapping("/board")
    @ResponseBody
    public int updBoard(@RequestBody BoardUpdDto dto){
        return service.updBoard(dto);
    }

}
