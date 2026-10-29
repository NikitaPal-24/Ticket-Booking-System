package com.example.ticket_booking_system.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {
	
//	To inject it using @Autowired (or constructor injection) in your services, Spring's Application Context must create and own the object as a Bean.
//	@Bean tells Spring how to build it: By writing this method inside a @Configuration class, you tell Spring: "Call this method once, take the new ModelMapper() object it returns, and register it in your Spring container so I can inject it anywhere."
	
	@Bean 
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
