package com.wwd.spring.cloud.controller;

import com.wwd.spring.cloud.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("zuul")
public class ZuulController {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @RequestMapping("demo")
    public String demo() {
        return "demo";
    }
}
