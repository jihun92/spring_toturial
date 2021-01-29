package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      
	   ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      HelloWorld obj2 = (HelloWorld) context.getBean("helloSpring");
      HelloWorld obj3 = (HelloWorld) context.getBean("helloSpring");
      
      obj.getMessage();
      obj2.getMessage();
      obj3.getMessage();
      
      System.out.println("obj2 address : "+System.identityHashCode(obj2));
      System.out.println("obj3 address : "+System.identityHashCode(obj3));
      
      System.out.println("obj2 and obj3 are same address!!");
      
   }
}