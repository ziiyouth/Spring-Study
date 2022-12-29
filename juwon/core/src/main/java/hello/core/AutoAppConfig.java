package hello.core;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))

public class AutoAppConfig {



    /**
    @Bean
    OrderService orderService(MemberRepository memberRepoisitory, DiscountPolicy
            discountPolicy) {
        new OrderServiceImpl(memberRepository, discountPolicy)
    }
     */

    /**
    @Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    */
}