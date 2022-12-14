package hello.core.order;

import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static hello.core.member.Grade.VIP;

public class OrderServiceTest {

    MemberService memberService=new MemberServiceImpl();
    OrderService orderService=new OrderServiceImpl();

    @Test
    void createOrder(){
        long memberId=1L;
        Member member=new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order=orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);


    }
}
