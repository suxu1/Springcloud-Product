package com.imooc.product;

import com.imooc.product.server.enums.SystemProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableDiscoveryClient
@EnableRedisRepositories
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProductApplication {

	public static void main(String[] args) {
		System.setProperty(SystemProperties.JASYPT.getKey(),SystemProperties.JASYPT.getValue());
		SpringApplication.run(ProductApplication.class, args);
	}

}

