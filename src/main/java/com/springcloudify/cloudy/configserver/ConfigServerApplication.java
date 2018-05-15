package com.springcloudify.cloudy.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringCloudApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
	}
}
