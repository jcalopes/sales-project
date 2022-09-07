package com.microservice.orderservice.config;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class WebClientConfig {

    @Bean
    //@LoadBalanced //Client Side Load Balancer
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
