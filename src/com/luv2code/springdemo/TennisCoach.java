package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Explicit Bean ID is thatSillyCoach
// @Component("thatSillyCoach")
@Component

// annotation for lazy-init="true"
@Lazy
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Autowired
	@Qualifier("customizedRandomService")
	private FortuneService randomFortuneService;

	public TennisCoach() {
		System.out.println("Constructor : TennisCoach");
	}

	/*// @Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("Arg-Constructor : TennisCoach");
		this.fortuneService = fortuneService;
	}*/

	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach : Inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}*/

	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach : Inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	/*@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}*/
	
	@Override
	public String getDailyFortune() {
		return randomFortuneService.getDailyFortune();
	}

}
