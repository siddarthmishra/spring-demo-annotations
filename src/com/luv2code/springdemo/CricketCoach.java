package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

	@Autowired
	private FortuneService databaseFortuneService;

	public static int count = 0;

	public CricketCoach() {
		System.out.println("No-Arg Constructor : CricketCoach called " + count + " time");
	}

	{
		count++;
	}

	@Override
	public String getDailyWorkout() {
		return "Bowl 20 overs";
	}

	@Override
	public String getDailyFortune() {
		return databaseFortuneService.getDailyFortune();
	}

}
