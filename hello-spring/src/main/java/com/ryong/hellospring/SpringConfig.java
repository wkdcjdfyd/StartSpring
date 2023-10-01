package com.ryong.hellospring;

import com.ryong.hellospring.repository.MemberRepository;
import com.ryong.hellospring.repository.MemoryMemberRepository;
import com.ryong.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
