package com.springcloudify.cloudify.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
	}
}
