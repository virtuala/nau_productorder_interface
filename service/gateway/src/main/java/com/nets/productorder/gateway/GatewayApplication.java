package com.nets.productorder.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	/***
	 * 网关gateway，IP限流，启动类里加如下方法
	 */
	@Bean(name="ipKeyResolver")
	public KeyResolver userKeyResolver() {
		return new KeyResolver() {
			@Override
			public Mono<String> resolve(ServerWebExchange exchange) {
				//获取远程客户端IP
				String hostName = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
				System.out.println("hostName:"+hostName);
				return Mono.just(hostName);
			}
		};
	}

}
