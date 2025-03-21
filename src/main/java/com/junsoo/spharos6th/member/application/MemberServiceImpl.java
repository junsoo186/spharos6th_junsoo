package com.junsoo.spharos6th.member.application;

import com.junsoo.spharos6th.common.jwt.JwtTokenProvider;
import com.junsoo.spharos6th.member.domain.Member;
import com.junsoo.spharos6th.member.dto.in.MemberAddDto;
import com.junsoo.spharos6th.member.dto.in.SignInRequestDto;
import com.junsoo.spharos6th.member.dto.in.SignUpRequestDto;
import com.junsoo.spharos6th.member.dto.out.SignInResponseDto;
import com.junsoo.spharos6th.member.infrastrusture.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final JwtTokenProvider jwtTokenProvider;
    private final AuthenticationManager authenticationManager;

    @Override
    public void addMember(MemberAddDto memberAddDto) {
        memberRepository.save(memberAddDto.toEntity(UUID.randomUUID().toString()));
    }

    @Override
    public void signUp(SignUpRequestDto signUpRequestDto) {

    }

    @Override
    public SignInResponseDto signIn(SignInRequestDto signInRequestDto) {

        Member member = memberRepository.findByEmail(signInRequestDto.getEmail()).orElseThrow(
                () -> new IllegalArgumentException(signInRequestDto.getEmail())
        );

        try {
            return SignInResponseDto.from(member, createToken(authenticate(member, signInRequestDto.getPassword())));

        } catch (Exception e) {
            throw new IllegalArgumentException(signInRequestDto.getEmail());
        }
    }

    @Override
    public UserDetails loadUserByUsername(String memberUuid) {
        return memberRepository.findByMemberUuid(memberUuid).orElseThrow(() -> new IllegalArgumentException(memberUuid));
    }

    private String createToken(Authentication authentication) {
        return jwtTokenProvider.generateAccessToken(authentication);
    }

    private Authentication authenticate(Member member, String inputPassword) {
        return authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        member.getEmail(),
                        inputPassword
                )
        );
    }




}