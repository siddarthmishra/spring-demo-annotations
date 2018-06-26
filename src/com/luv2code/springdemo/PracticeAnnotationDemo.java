package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemo {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		String[] beanNames = context.getBeanDefinitionNames();

		// display bean names and classes
		for (String beanName : beanNames) {
			String beanClass = context.getBean(beanName).getClass().toString();

			System.out.println(beanName + " : " + beanClass);
		}

		// retrieve the bean from spring container
		Coach pingPongCoach = context.getBean("pingPongCoach", Coach.class);

		// call the method
		System.out.println(pingPongCoach.getDailyWorkout());
		System.out.println(pingPongCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
