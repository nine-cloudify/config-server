package com.springcloudify.cloudy.configserver;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringCloudApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApplication.class).web(WebApplicationType.SERVLET).run(args);
	}
}
