package jmr.ms.piotr05gossip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Piotr05GossipApplication {

	public static void main(String[] args) {
		SpringApplication.run(Piotr05GossipApplication.class, args);
	}

}

