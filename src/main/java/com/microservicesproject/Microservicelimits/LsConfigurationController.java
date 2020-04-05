package com.microservicesproject.Microservicelimits;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesproject.Microservicelimits.bean.LimitConfig;

@RestController
public class LsConfigurationController {
	
	
    @GetMapping("/limits")
	public LimitConfig retireveLimitsfromConfig() {
    	return new LimitConfig(1000, 1);
    }

}
