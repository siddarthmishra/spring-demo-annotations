package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeJavaConfigFile {

	public PracticeJavaConfigFile() {
		System.out.println("No-Arg Constructor : PracticeJavaConfigFile");
	}

	@Bean
	public PracticeJavaConfigCoach practiceJavaConfigCoach() {
		System.out.println("Inside Bean practiceJavaConfigCoach() of PracticeJavaConfigFile");
		return new PracticeJavaConfigCoach(practiceJavaConfigFortuneService());
	}

	@Bean
	public PracticeJavaConfigFortuneService practiceJavaConfigFortuneService() {
		System.out.println("Inside Bean practiceJavaConfigCoach() of practiceJavaConfigFortuneService");
		return new PracticeJavaConfigFortuneService();
	}

}