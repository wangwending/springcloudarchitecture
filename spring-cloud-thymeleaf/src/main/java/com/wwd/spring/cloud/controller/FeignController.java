package com.wwd.spring.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    private static final Logger logger = LoggerFactory.getLogger(FeignController.class);

    @RequestMapping("/demo")
    public String demo(@RequestParam("body") String body) throws  Exception{
//        Thread.sleep(100L);
        return body;
    }

    @RequestMapping("/paramsArr")
    public String paramsArr(@RequestParam("param1") String param1, @RequestParam("param2") int param2) {
        String result = "参数1:" + param1 + " , 参数2:" + param2;
        return  result;
    }
}
