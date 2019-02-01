package com.wwd.spring.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wwd.spring.feign.fallback.FeignHystrixCallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-thymeleaf", fallback = FeignHystrixCallBack.class)
//@FeignClient(value = "eureka-thymeleaf")
public interface FeignHystrix {

    @HystrixCommand(groupKey = "FeignHystrix", threadPoolKey = "FeignHystrix", commandKey = "hystrixDemo(String)",
            commandProperties = {@HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10")})
    @RequestMapping(value = "/feign/demo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String hystrixDemo(@RequestParam("body") String body);

    @RequestMapping(value = "/feign/paramsArr", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String hystrixParams(@RequestParam("param1") String param1, @RequestParam("param2") int param2);
}
