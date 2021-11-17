package com.system.design.gateway;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.system.design.gateway.gateway", exclude = {DataSourceAutoConfiguration.class})
public class SeckillGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SeckillGatewayApplication.class).run(args);
    }

}
