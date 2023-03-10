package com.nets.productorder.warehouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(value={"com.nets.productorder.warehouse.dao"})
public class WarehouseApplication {
	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}
}
