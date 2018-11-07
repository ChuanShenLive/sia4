package com.chuanshen.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXmlContext {

	public static void main(String[] args) {
		System.out.println("Application with xml context start.");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/soundsystem.xml");
		SgtPeppers sgt = context.getBean(SgtPeppers.class);
		sgt.play();
		context.close();
	}
}
