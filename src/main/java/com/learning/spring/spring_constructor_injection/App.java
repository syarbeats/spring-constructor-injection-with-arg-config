package com.learning.spring.spring_constructor_injection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-config.xml");
        ctx.refresh();
        ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(cc);
        ctx.close();
        		
    }
}
