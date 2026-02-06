package com.green.boardauth.application.user.board;

import com.green.boardauth.application.user.board.model.BoardPostReq;
import com.green.boardauth.configuration.model.ResultResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public int postBoard (BoardPostReq req) {
        return boardMapper.save(req);
    }

}
