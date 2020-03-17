package com.chuanshen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight3.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
