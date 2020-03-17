package com.chuanshen;

import com.chuanshen.config.KnightConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig4.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
