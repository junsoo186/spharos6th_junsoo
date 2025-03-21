package com.junsoo.spharos6th.common.config;

import com.junsoo.spharos6th.common.jwt.JwtTokenProvider;
import com.junsoo.spharos6th.member.application.MemberService;
import com.junsoo.spharos6th.member.infrastrusture.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@RequiredArgsConstructor
@Configuration
public class ApplicationConfig {

    private final MemberRepository memberRepository;
    private final MemberService memberService;
    private  final JwtTokenProvider jwtTokenProvider;

    @Bean
    public UserDetailsService userDetailsService() {
        return uuid -> {
            return memberRepository.findByUuid(uuid).orElseThrow(
                    () -> new IllegalArgumentException("해당 이메일을 가진 회원이 없습니다.")
            );
        };
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
            throws Exception {
        return new ProviderManager(
                Arrays.asList(
                        daoAuthenticationProvider()
                )
        );
    }

    @Bean
    public AuthenticationProvider daoAuthenticationProvider() {
        return null;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}