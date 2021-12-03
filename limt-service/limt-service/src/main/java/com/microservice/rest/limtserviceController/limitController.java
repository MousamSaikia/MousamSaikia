package com.microservice.rest.limtserviceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.rest.limtserviceEntity.limit;

@RestController
@ComponentScan(basePackages = "com.microservice.rest.limtserviceEntity")
public class limitController {

	@Autowired
	private limit limit;

	@GetMapping(path = "/limits")
	public limit getlimit() {
		return new limit(limit.getMaxLimit(), limit.getMinLimit());
		// return new limit(1, 1000);
	}

}
