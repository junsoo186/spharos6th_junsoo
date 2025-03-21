package com.junsoo.spharos6th.member.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SignInRequestVo {

    private String email;
    private String password;

    @Builder
    public SignInRequestVo(String email, String password) {
        this.email = email;
        this.password = password;
    }


}
