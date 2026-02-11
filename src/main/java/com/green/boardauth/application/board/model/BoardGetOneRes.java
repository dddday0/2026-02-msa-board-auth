package com.green.boardauth.application.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BoardGetOneRes {
    private long id;
    private long userId;
    private String title;
    private String contents;
    private String createdAt;
    private String nm;
}
