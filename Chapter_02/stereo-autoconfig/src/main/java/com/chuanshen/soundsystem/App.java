package com.chuanshen.soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        SgtPeppers sgt = context.getBean(SgtPeppers.class);
        sgt.play();
        context.close();
    }
}
