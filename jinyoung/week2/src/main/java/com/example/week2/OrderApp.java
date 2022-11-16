package com.example.week2;

import com.example.week2.member.Grade;
import com.example.week2.member.Member;
import com.example.week2.member.MemberService;
import com.example.week2.member.MemberServiceImpl;
import com.example.week2.order.Order;
import com.example.week2.order.OrderService;
import com.example.week2.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println(order.cacluatePrice());

    }
}
