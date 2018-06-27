package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve beans from the spring container
		// for singleton
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaTennisCoach = context.getBean("tennisCoach", Coach.class);

		// for prototype
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		Coach alphaCricketCoach = context.getBean("cricketCoach", Coach.class);

		// check if they are same
		boolean singletonResult = tennisCoach == alphaTennisCoach;
		boolean prototypeResult = cricketCoach == alphaCricketCoach;

		// print out the result
		System.out.println("\nFor TennisCoach : ");
		System.out.println("pointing to same object : " + singletonResult);
		System.out.println("Memory location for tennisCoach : " + tennisCoach);
		System.out.println("Memory location for alphaTennisCoach : " + alphaTennisCoach);
		System.out.println("\nFor CricketCoach : ");
		System.out.println("pointing to same object : " + prototypeResult);
		System.out.println("Memory location for cricketCoach : " + cricketCoach);
		System.out.println("Memory location for alphaCricketCoach : " + alphaCricketCoach);

		// close the context
		context.close();
	}

}
