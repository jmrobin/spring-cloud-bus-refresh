package jmr.ms.piotr05eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Piotr05EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Piotr05EurekaServerApplication.class, args);
	}

}

