package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscoundPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscoundPolicy();

    @Override
    public Order createOrder(Long memberId, String itenName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itenName, itemPrice, discountPrice);
    }
}
