package com.junsoo.spharos6th.member.application;

import com.junsoo.spharos6th.member.dto.in.MemberAddDto;
import com.junsoo.spharos6th.member.dto.out.SignInResponseDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface MemberService  {
   void addMember(MemberAddDto memberAddDto);
   SignInResponseDto signIn(String memberUuid, String password);
   UserDetails loadUserByUsername(String memberUuid);
}
