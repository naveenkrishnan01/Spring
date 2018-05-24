package com.example.rule;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RuleMain {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the bean container
		   ReadFile theFile = context.getBean("myRules", ReadFile.class);
			
		// call the literal methods in bean
		   System.out.println(theFile.getCustomerIDRec());
		   System.out.println(theFile.getRuleTyeRec());
		
		//  close the context
		context.close();

	}

}
