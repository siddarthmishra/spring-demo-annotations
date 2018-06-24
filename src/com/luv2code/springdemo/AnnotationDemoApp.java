package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the spring container

		// below uses explicit bean id
		// Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);

		// below uses default bean id
		// Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

		// call a method on the bean
		System.out.println("Daily Workout : " + tennisCoach.getDailyWorkout());
		System.out.println("Daily Fortune : " + tennisCoach.getDailyFortune());
		System.out.println("Email : " + tennisCoach.getEmail());
		System.out.println("Team : " + tennisCoach.getTeam());

		// close the context
		context.close();
	}

}
