package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("customizedRandomService")
public class RandomFortuneService implements FortuneService {

	// create array of Strings
	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The Journey is the reward" };

	// create a random generator
	private Random myRandom = new Random();

	@Override
	public String getDailyFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
