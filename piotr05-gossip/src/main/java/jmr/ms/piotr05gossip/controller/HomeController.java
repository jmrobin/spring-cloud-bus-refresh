package jmr.ms.piotr05gossip.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HomeController
{
	@Value("${gossip.version}")
	private String version;
	
	@GetMapping("/version")
	public String getVersion()
	{
		return this.version;
	}
}
