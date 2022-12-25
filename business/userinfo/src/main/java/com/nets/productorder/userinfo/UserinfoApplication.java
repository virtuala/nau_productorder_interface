package com.nets.productorder.userinfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(value={"com.nets.productorder.userinfo.dao"})
public class UserinfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserinfoApplication.class, args);
	}
}
