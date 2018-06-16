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
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
