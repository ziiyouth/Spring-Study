package com.example.week2;

import com.example.week2.discount.DiscountPolicy;
import com.example.week2.discount.FixDiscountPolicy;
import com.example.week2.member.MemberRepository;
import com.example.week2.member.MemberService;
import com.example.week2.member.MemberServiceImpl;
import com.example.week2.member.MemoryMemberRepository;
import com.example.week2.order.OrderService;
import com.example.week2.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }


}