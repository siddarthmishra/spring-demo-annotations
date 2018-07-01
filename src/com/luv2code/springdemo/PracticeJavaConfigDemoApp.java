package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeJavaConfigDemoApp {

	public static void main(String[] args) {

		// load/read spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				PracticeJavaConfigFile.class);

		// retrieve bean from the spring container
		Coach theCoach = context.getBean("practiceJavaConfigCoach", Coach.class);

		// call the methods
		System.out.println("Fortune : " + theCoach.getDailyFortune());
		System.out.println("Workout : " + theCoach.getDailyWorkout());

		// close the context
		context.close();
	}
}
