package com.green.springfirst.board;

import com.green.springfirst.ResVo;
import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController은 json으로 응답 @Controller은 html으로 응답

@RestController //빈등록 하면서 컨트롤러의 역할도 한다 (컨트롤러 : 요청시 응답함)
@RequiredArgsConstructor //생성자 만들기
@RequestMapping("/api/borad") //주소값 통일  @*Mapping뒤에 주소값을 자동으로 넣어줌
public class BoardController {
    private final BoardService service;

    //@Autowired
    //private BoardService service;

    @GetMapping("/{iboard}")  //{iboard}에 뭐든 받음 그것을 변수 int iboard에 넣음
    public BoardDetailVo getBoardDetail(@PathVariable int iboard){//@PathVariable 주소값에 변수가 있음
        return service.getBoardById(iboard);
    }

    @GetMapping
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }
    //같은 주소값이라도 날리는 방식에 따라(get방식 post방식) 분기가능

    @PostMapping
    @ResponseBody //@ResponseBody json형태로 들어오는 주소값을 응답
    public ResVo postBoard(@RequestBody BoardInsDto dto){ //@RequestBody json형태로 들어오는 주소값을 받아줌
        System.out.println(dto);
        int result = service.postBoard(dto);
        System.out.println("result :" + result);
        return new ResVo(result);
    }

    @DeleteMapping("/{iboard}")  //{iboard}에 뭐든 받음 그것을 변수 int iboard에 넣음
    public ResVo delBoard(@PathVariable int iboard){//@PathVariable 주소값에 변수가 있음
        System.out.println(iboard);
        int result = service.delBoard(iboard);
        System.out.println(result);
        return new ResVo(result);
    }

    @PutMapping  //{iboard}에 뭐든 받음 그것을 변수 int iboard에 넣음
    public ResVo putBoard(@RequestBody BoardUpdDto dto){//@PathVariable 주소값에 변수가 있음
        int result = service.putBoard(dto);
        return new ResVo(result);
    }
}
