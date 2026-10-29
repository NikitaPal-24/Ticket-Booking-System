package com.example.ticket_booking_system.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
	
//	This method takes Spring's security builder tool (HttpSecurity http) and builds the master gatekeeper (SecurityFilterChain) that inspects every incoming web request.
	//http.csrf(csrf->csrf.disable()); Turns off browser-based CSRF protection so API tools (like Postman) can send POST, PUT, and DELETE requests without getting a 403 Forbidden error.
	//http.authorizeHttpRequests(auth->auth.anyRequest().permitAll()); Allows all incoming HTTP requests to access every endpoint without requiring any username, password, or login token.
	//return http.build(); Assembles all your configured security rules into an active filter chain object and registers it with Spring.
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		http.csrf(csrf->csrf.disable());
		http.authorizeHttpRequests(auth->auth.anyRequest().permitAll());
		return http.build();
	}
}
