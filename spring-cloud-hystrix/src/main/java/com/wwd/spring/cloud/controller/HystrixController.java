package com.wwd.spring.cloud.controller;

import com.wwd.spring.feign.FeignHystrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    private static final Logger logger = LoggerFactory.getLogger(HystrixController.class);

    @Autowired
    private FeignHystrix feignHystrix;

    @GetMapping(value = "/demo")
    public String demo()  {
        String result = "";
        try {
            result = feignHystrix.hystrixDemo("{\"hi\": \"hystrix\"}");
        } catch (Exception e) {
            logger.error("hystrix throws Exception: {}", e);
        }
        return  result;
    }

    @GetMapping(value = "/demo2")
    public String demo2()  {
        String result = "";
        try {
            result = feignHystrix.hystrixParams("gg", 2);
        } catch (Exception e) {
            logger.error("hystrix throws Exception: {}", e);
        }
        return  result;
    }
}
