package com.wwd.spring.feign.fallback;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wwd.spring.feign.FeignHystrix;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrixCallBack implements FeignHystrix{

    private static final Logger logger = LoggerFactory.getLogger(FeignHystrixCallBack.class);

    public FeignHystrixCallBack() {}

    @Override
    public String hystrixDemo(String body) {
        return body + "call hystrixDemo Exception";
    }

    @Override
    public String hystrixParams(String param1, int param2) {
        return "参数{" + param1 + "}, 参数{" + param2 + "} call hystrixParams Exception";
    }
}
