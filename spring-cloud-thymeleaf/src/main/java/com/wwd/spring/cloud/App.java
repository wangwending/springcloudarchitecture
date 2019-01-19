package com.wwd.spring.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.wwd.spring.cloud.*"})
@EnableEurekaClient
public class App {

        private static final Logger logger = LoggerFactory.getLogger(App.class);

        public static void main(String[] args) {
            SpringApplication.run(App.class, args);
            logger.info("App start Success!!!");
        }
}