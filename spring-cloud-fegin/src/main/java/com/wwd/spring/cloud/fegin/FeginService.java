package com.wwd.spring.cloud.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "eureka-thymeleaf")
public interface FeginService {
    /**
     *
     */
    @RequestMapping(value = "/feign/demo", method = RequestMethod.GET)
    String getFeignDemo(@RequestParam("body") String body);

}
