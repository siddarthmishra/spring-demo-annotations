package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public DatabaseFortuneService() {
		System.out.println("No-Arg Constructor : DatabaseFortuneService");
	}

	@Override
	public String getDailyFortune() {
		return "Your fortune is DatabaseFortuneService";
	}

}
