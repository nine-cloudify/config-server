package com.springcloudify.cloudy.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringCloudApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
	}
}
