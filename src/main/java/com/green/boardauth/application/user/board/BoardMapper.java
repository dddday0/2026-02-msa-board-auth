package com.green.boardauth.application.user.board;

import com.green.boardauth.application.user.board.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int save(BoardPostReq req);
}
