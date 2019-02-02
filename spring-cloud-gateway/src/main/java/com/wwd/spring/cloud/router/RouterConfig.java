package com.wwd.spring.cloud.router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return  builder.routes().route(r -> r.path("/baidu").uri("https://wwww.baidu.com/")).build();
    }

    @Bean
    public RouteLocator thymeleafViewRouteLocator(RouteLocatorBuilder builder) {
        return  builder.routes().route(r -> r.path("/view/**").uri("lb://eureka-thymeleaf").id("eureka-thymeleaf-view")).build();
    }

    @Bean
    public RouteLocator feignRouteLocator(RouteLocatorBuilder builder) {
        return  builder.routes().route(r -> r.path("/feign-client/test").uri("lb://eureka-feign").id("eureka-feign-client")).build();
    }

    @Bean
    public RouteLocator thymeleafDemoRouteLocator(RouteLocatorBuilder builder) {
        return  builder.routes().route(r -> r.path("/demo/**").uri("lb://eureka-thymeleaf").id("eureka-thymeleaf-demo")).build();
    }

}
