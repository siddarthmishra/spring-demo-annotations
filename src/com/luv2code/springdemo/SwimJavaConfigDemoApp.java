package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// load/read spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigBean.class);

		// retrieve the beans from the spring container
		// Coach theCoach = context.getBean("swimCoach", Coach.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());

		System.out.println("Email : " + theCoach.getEmail());
		System.out.println("Team : " + theCoach.getTeam());

		// close the context
		context.close();
	}
}
