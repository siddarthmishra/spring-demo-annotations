package com.luv2code.springdemo;

public class PracticeJavaConfigCoach implements Coach {

	private FortuneService practiceJavaConfigFortuneService;

	public PracticeJavaConfigCoach() {
		System.out.println("No-Arg Constructor : PracticeJavaConfigCoach");
	}

	public PracticeJavaConfigCoach(FortuneService practiceJavaConfigFortuneService) {
		System.out.println("Arg Constructor : PracticeJavaConfigCoach");
		this.practiceJavaConfigFortuneService = practiceJavaConfigFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Coding daily 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return practiceJavaConfigFortuneService.getDailyFortune();
	}
}
