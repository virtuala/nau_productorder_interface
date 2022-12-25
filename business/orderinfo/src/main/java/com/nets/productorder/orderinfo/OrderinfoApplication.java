package com.nets.productorder.orderinfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(value={"com.nets.productorder.orderinfo.dao"})
public class OrderinfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderinfoApplication.class, args);
	}
}
