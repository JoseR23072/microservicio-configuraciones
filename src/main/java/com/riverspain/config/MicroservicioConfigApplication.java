package com.riverspain.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(exclude = {
    org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration.class
})
public class MicroservicioConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioConfigApplication.class, args);
	}

}
