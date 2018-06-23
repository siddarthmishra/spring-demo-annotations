package com.luv2code.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

// annotation for lazy-init="true"
@Lazy
public class PingPongCoach implements Coach {

	PingPongCoach() {
		System.out.println("Constructor : PingPongCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
