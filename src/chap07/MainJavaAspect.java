package chap07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import temp.JavaConfig;

public class MainJavaAspect {
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact);
		
	}

}
