package com.junsoo.spharos6th.member.application;

import com.junsoo.spharos6th.member.dto.in.MemberAddDto;
import com.junsoo.spharos6th.member.dto.in.SignInRequestDto;
import com.junsoo.spharos6th.member.dto.in.SignUpRequestDto;
import com.junsoo.spharos6th.member.dto.out.SignInResponseDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface MemberService {

   void addMember(MemberAddDto memberAddDto);
   void signUp(SignUpRequestDto signUpRequestDto);
   SignInResponseDto signIn(SignInRequestDto signInRequestDto);
   UserDetails loadUserByUsername(String memberUuid);

}