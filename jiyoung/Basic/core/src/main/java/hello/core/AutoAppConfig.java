package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;

// 예제를 안전하게 유지하기 위해서 뺌
@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))

public class AutoAppConfig {
}
