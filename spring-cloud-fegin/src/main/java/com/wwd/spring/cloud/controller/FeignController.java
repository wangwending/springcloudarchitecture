package com.wwd.spring.cloud.controller;

import com.wwd.spring.cloud.fegin.FeginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign-client")
public class FeignController {

    private static final Logger logger = LoggerFactory.getLogger(FeignController.class);

    @Autowired
    private FeginService feginService;

    @RequestMapping("/test")
    public String test() {
        String body = "hello feign";
        String respone = feginService.getFeignDemo(body);
        return respone;
    }
}
