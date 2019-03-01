package com.xxw.first_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run( OrderServiceApplication.class, args );
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/order")
	public String order(@RequestParam(value = "productName", defaultValue = "airPots") String productName) {
		return  "商品："+productName + " ，已成功下单，由" + port+"端口的订单服务处理";
	}
}
