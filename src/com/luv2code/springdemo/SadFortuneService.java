package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	public SadFortuneService() {
		System.out.println("No-Arg Constructor : SadFortuneService");
	}

	@Override
	public String getDailyFortune() {
		return "Today is a sad day";
	}
}
