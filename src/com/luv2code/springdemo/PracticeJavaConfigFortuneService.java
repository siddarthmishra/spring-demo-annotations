package com.luv2code.springdemo;

public class PracticeJavaConfigFortuneService implements FortuneService {

	public PracticeJavaConfigFortuneService() {
		System.out.println("No-Arg Constructor : PracticeJavaConfigFortuneService");
	}

	@Override
	public String getDailyFortune() {
		return "Knowledge is of no value unless you put it into practice";
	}
}
