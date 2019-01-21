package com.wwd.spring.cloud.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-thymeleaf")
public interface FeignHystrix {

    @RequestMapping("/feign/demo")
    String feignDemo();
}
