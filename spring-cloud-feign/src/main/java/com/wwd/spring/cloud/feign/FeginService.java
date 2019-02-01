package com.wwd.spring.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "eureka-thymeleaf")
public interface FeginService {
    /**
     *
     */
    @RequestMapping(value = "/feign/demo", method = RequestMethod.GET)
    String getFeignDemo(@RequestParam("body") String body);

}
