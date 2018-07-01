package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService sadFortuneService;

	public SwimCoach() {
		System.out.println("No-Arg Constructor : SwimCoach");
	}

	public SwimCoach(FortuneService sadFortuneService) {
		System.out.println("Arg Constructor : SwimCoach");
		this.sadFortuneService = sadFortuneService;
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
