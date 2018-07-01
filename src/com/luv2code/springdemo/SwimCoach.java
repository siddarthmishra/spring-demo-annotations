package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService sadFortuneService;

	@Value("${email}")
	private String email;

	@Value("${team}")
	private String team;

	public SwimCoach() {
		System.out.println("No-Arg Constructor : SwimCoach");
	}

	public SwimCoach(FortuneService sadFortuneService) {
		System.out.println("Arg Constructor : SwimCoach");
		this.sadFortuneService = sadFortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return sadFortuneService.getDailyFortune();
	}

}
