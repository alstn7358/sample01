package chap07;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
	   if(num == 0)
		   return 1;
	   else
		// TODO Auto-generated method stub
		return num * factorial(num -1);
	}

}
