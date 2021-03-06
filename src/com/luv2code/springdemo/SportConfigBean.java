package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// Injecting Properties file using Java Code
@PropertySource("classpath:sport.properties")
public class SportConfigBean {

	public SportConfigBean() {
		System.out.println("No-Arg Constructor : SportConfigBean");
	}

	// define bean for our SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		System.out.println("Inside Bean sadFortuneService() of SportConfigBean");
		return new SadFortuneService();
	}

	@Bean
	// define bean for our SwimCoach AND inject dependencies
	public SwimCoach swimCoach() {
		System.out.println("Inside Bean swimCoach() of SportConfigBean");
		return new SwimCoach(sadFortuneService());
	}

	/*
	 * If you are using Spring 4.2 and lower, you will need to add the code below
	 * for Injecting Values from properties file
	 */
	// add support to resolve ${...} properties
	/* @Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	} */
}
