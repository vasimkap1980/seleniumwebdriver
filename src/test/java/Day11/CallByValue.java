package Day11;

public class CallByValue {

	public static void main(String[] args) 
	{
		Test test=new Test();
		int number=100;
		
		System.out.println("before methord:"  + number);
		
		test.m1(number);
		System.out.println("after methord:"  + number);
		
		
		

	}

}
