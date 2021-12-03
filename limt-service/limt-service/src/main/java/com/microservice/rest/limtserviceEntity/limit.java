package com.microservice.rest.limtserviceEntity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limt-service")
public class limit {

	public int maxLimit;
	public int minLimit;
	
	
	

	public limit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public limit(int maxLimit, int minLimit) {
		super();
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public int getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}

}
