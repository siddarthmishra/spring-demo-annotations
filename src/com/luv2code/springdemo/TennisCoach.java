package com.luv2code.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Explicit Bean ID is thatSillyCoach
// @Component("thatSillyCoach")
@Component

// annotation for lazy-init="true"
@Lazy
public class TennisCoach implements Coach {

	TennisCoach() {
		System.out.println("Constructor : TennisCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}