package com.green.boardauth.application.user;

import com.green.boardauth.application.user.model.UserGetOneRes;
import com.green.boardauth.application.user.model.UserSignUpReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int signup(UserSignUpReq req);
    UserGetOneRes findByUid(String uid);
}