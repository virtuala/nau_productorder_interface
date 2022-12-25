package com.nets.productorder.productline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(value={"com.nets.productorder.productline.dao"})
public class ProductlineApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductlineApplication.class, args);
	}
}
