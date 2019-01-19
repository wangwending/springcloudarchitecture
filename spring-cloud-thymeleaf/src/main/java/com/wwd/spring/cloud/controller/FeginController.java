package com.wwd.spring.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeginController {

    private static final Logger logger = LoggerFactory.getLogger(FeginController.class);

    @RequestMapping("/demo")
    public String demo(@RequestParam("body") String body) throws  Exception{
        return body;
    }
}
