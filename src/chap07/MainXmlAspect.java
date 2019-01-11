package chap07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXmlAspect {
	
	public static void main(String[] args){
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap07/aopAspect.xml");
		
		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		long fiveFact = impeCal.factorial(5);
		System.out.println("impeCal.factorial(5) = " + fiveFact);
		
		Calculator impeCal2 = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = impeCal2.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);		
		
		
	}

}
