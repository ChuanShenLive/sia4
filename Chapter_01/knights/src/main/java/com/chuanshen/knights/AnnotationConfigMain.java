package com.chuanshen.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chuanshen.knights.config.KnightConfig;

public class AnnotationConfigMain {
	
	public static void main( String[] args ) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
