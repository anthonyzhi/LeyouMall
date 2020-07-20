package com.leyou;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LeyouGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(LeyouGatewayApplication.class);
    }

}
