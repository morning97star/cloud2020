package com.zcx.cloud.gateway.hard;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder) {

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("route1", route -> route.path("/guonei").uri("https://news.baidu.com/"));
        routes.route("route2", route -> route.path("/mil").uri("https://news.baidu.com/"));
        return routes.build();
    }
}
