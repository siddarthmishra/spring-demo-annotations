package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

// annotation for lazy-init="true"
@Lazy
public class PingPongCoach implements Coach {

	@Autowired
	private FortuneService fileRandomFortuneService;

	/*@Autowired
	public PingPongCoach(FortuneService fileRandomFortuneService) {
		System.out.println("Arg - Constructor : PingPongCoach");
		this.fileRandomFortuneService = fileRandomFortuneService;
	}*/

	/*@Autowired
	public void setFileRandomFortuneService(FortuneService fileRandomFortuneService) {
		System.out.println("PingPongCoach : Inside setFileRandomFortuneService() method");
		this.fileRandomFortuneService = fileRandomFortuneService;
	}*/


	PingPongCoach() {
		System.out.println("Constructor : PingPongCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fileRandomFortuneService.getDailyFortune();
	}

}
