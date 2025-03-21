package com.junsoo.spharos6th.member.application;
import com.junsoo.spharos6th.member.dto.in.MemberAddDto;
import com.junsoo.spharos6th.member.dto.out.SignInResponseDto;
import com.junsoo.spharos6th.member.infrastrusture.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void addMember(MemberAddDto memberAddDto) {
        memberRepository.save(memberAddDto.toEntity(UUID.randomUUID().toString()));
    }

    @Override
    public SignInResponseDto signIn(String memberUuid, String password) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String memberUuid) {
        return memberRepository.findByUuid(memberUuid).orElseThrow(() -> new IllegalArgumentException(memberUuid));
    }
}