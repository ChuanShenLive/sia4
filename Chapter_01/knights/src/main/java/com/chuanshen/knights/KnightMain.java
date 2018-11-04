package com.chuanshen.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain 
{
    public static void main( String[] args )
    {
        // DamselRescuingKnight knight = new DamselRescuingKnight();
        // knight.embarkOnQuest();
        
    	// 加载 Spring 上下文
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        // 获取 knight bean
        Knight knight = context.getBean(Knight.class);
        // 使用 knight
        knight.embarkOnQuest();
        context.close();
    }
}
