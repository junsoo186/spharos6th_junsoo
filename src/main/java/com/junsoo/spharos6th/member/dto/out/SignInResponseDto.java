package com.junsoo.spharos6th.member.dto.out;

import com.junsoo.spharos6th.member.domain.Member;
import com.junsoo.spharos6th.member.dto.in.SignInRequestDto;
import lombok.Builder;
import lombok.Getter;

@Getter
public class SignInResponseDto {
    private String accessToken;
    private String memberUuid;
    private String name;

    @Builder
    public SignInResponseDto(String accessToken, String memberUuid, String name) {
        this.accessToken = accessToken;
        this.memberUuid = memberUuid;
        this.name = name;
    }

    public static SignInResponseDto from(Member member, String accessToken) {
        return SignInRequestDto.builder()
                .accessToken(accessToken)
                .memberUuid(member.getMemberUuid()
                .name(member.getName())
                .build();
    }

}
